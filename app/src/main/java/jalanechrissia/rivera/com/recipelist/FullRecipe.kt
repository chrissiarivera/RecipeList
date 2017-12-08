package jalanechrissia.rivera.com.recipelist

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.full_recipe.*

/**
 * Created by Jalane Chrissia on 08/12/2017.
 */
class FullRecipe : AppCompatActivity() {
//    private var mRecipeImg: ImageView? = null
//    private var mRecipeName: TextView? = null
//    private var mRecipeIngredients: TextView? = null
//    private var mRecipeProcedure: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.full_recipe)

        if(intent != null){
            val recipe = intent.getParcelableExtra<Recipe>(Pass.RECIPE)

            name?.text = recipe.name
            txtIngredients?.text = recipe.ingredients
            txtInstructions?.text = recipe.instruction
            val drawable : Drawable? = getResources().getDrawable(recipe.img)
            imgRecipe?.setImageDrawable(drawable)
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        if (getSupportActionBar() != null) {
            getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)
            getSupportActionBar()!!.setDisplayShowHomeEnabled(true)
        }

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}