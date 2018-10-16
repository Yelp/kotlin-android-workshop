package my.demo.app5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.content_main.*
import my.demo.app5.model.BusinessRepo

class MainFragment : Fragment() {
    companion object {
        fun newInstance() = MainFragment()
    }

    private var businessRepo: BusinessRepo = BusinessRepo.instance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.content_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hiWorld.text = getString(R.string.greeting)
        searchBar.setIconifiedByDefault(false)
        searchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?) = true
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query == null) return true
                businessRepo.search(query).subscribe { list, error ->
                    hiWorld.text = when (list?.total) {
                        null, 0 -> getString(R.string.empty_result, query)
                        else -> list.businesses.first().name
                    }
                    if (error != null) throw error
                }
                return true
            }
        })
    }
}
