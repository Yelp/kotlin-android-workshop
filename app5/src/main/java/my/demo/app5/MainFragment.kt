package my.demo.app5

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.SearchView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            override fun onQueryTextSubmit(query: String?) = true.also {
                if (query == null) return@also

                businessRepo.search(query).subscribe { list, _ ->
                    if (list == null) error("Something bad happened!")
                    if (list.isEmpty()) {
                        hiWorld.text = getString(R.string.empty_result, query)
                        return@subscribe
                    }

                    hiWorld.text = list.first().name
                }
            }
        })
    }
}