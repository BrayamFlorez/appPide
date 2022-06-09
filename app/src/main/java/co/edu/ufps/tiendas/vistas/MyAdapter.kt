package co.edu.ufps.tiendas.vistas

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter
import co.edu.ufps.tiendas.fragments.FavoritasFragment;
import co.edu.ufps.tiendas.fragments.PerfilFragment;
import co.edu.ufps.tiendas.fragments.TiendasFragment;

class MyAdapter(
    var context: Context,
    fm: FragmentManager,
    val totalTabs: Int): FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> {
                TiendasFragment()
            }
            1 -> {
                FavoritasFragment()
            }
            2 -> {
                PerfilFragment()
            }
            else -> getItem(position)
        }

    }

}