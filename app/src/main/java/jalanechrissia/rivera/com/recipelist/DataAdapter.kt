package jalanechrissia.rivera.com.recipelist

/**
 * Created by Jalane Chrissia on 07/12/2017.
 */

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class DataAdapter(val recipeList: ArrayList<Recipe>) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val recipe: Recipe = recipeList[position]
        holder?.textViewName?.text = recipe.name
        holder?.textViewDescription?.text = recipe.description

        holder?.linearLayout?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View) {
                val intent = Intent(v.context, FullRecipe::class.java)
                intent.putExtra(Pass.RECIPE, recipe)
                v.context.startActivity(intent)
            }
        })
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
1    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById<TextView>(R.id.txtName) as TextView
        val textViewDescription = itemView.findViewById<TextView>(R.id.txtDesc) as TextView
        val linearLayout = itemView.findViewById<LinearLayout>(R.id.LinearLayout) as LinearLayout
    }
}