package my.demo.app6

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.SearchView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.content_main.*
import my.demo.app6.model.BusinessRepo

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

        searchBar.setIconifiedByDefault(false)
        searchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String?) = true
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query == null) return true
                businessRepo.search(query).subscribe { list, error ->
                    val hasNoResults = (list?.total ?: 0) == 0
                    hiWorld.isVisible = hasNoResults
                    listView.isGone = hasNoResults
                    if (hasNoResults) {
                        hiWorld.text = getString(R.string.empty_result, query)
                    } else {
                        listView.adapter = BusinessSearchAdapter(list.businesses)
                    }
                }
                return true
            }
        })
    }
}