package live.codemy.milliyetapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_news.*
import live.codemy.milliyetapp.R
import live.codemy.milliyetapp.adapter.NewsListAdapter
import live.codemy.milliyetapp.mock.MockData

class NewsFragment : Fragment(R.layout.fragment_news) {

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_news, container, false)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycNewsList.adapter = NewsListAdapter(MockData.getNewsList(10)) { bigNewsModel ->

        }
    }
}
