package jalanechrissia.rivera.com.recipelist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val recipes = ArrayList<Recipe>()

        recipes.add(Recipe(R.drawable.salted_caramel_banana_pudding,
                "Salted Caramel Banana Pudding",
                "Just when you thought pudding was already perfect",
                "1 1/3 c. milk\n" +
                        "1 package instant vanilla pudding\n" +
                        "1 14-oz. can sweetened condensed milk\n" +
                        "3 c. heavy cream\n" +
                        "1/4 c. powdered sugar\n" +
                        "1 tsp. pure vanilla extract\n" +
                        "2 1/3 c. caramel, divided\n" +
                        "Flaky sea salt\n" +
                        "1 12-oz. box vanilla wafer cookies\n" +
                        "4 bananas, sliced into coins",
                "1. In a large bowl, combine milk, vanilla pudding mix and sweetened condensed milk. Whisk thoroughly, breaking up any lumps, and refrigerate for at least 5 minutes, or until set.\n" +
                        "2. In another large bowl, combine heavy cream, powdered sugar and vanilla. Beat until stiff peaks form, 2 to 3 minutes. Set aside half of the mixture for topping the dish. Fold remaining half into the pudding mixture along with ⅓ cup caramel and ½ teaspoon flaky sea salt.\n" +
                        "3. Cover the bottom of a 3-quart trifle dish with vanilla wafers. Top with one-third of the pudding mixture. Cover with another layer of the wafer cookies—you may want to also stand some cookies up vertically, so you see the full circle along the edge of the trifle dish. Top with an even layer of banana slices then drizzle caramel sauce on top. Continue layering the pudding, wafer cookies, banana slices, and caramel until you reach the top, ending with a final layer of banana pudding.\n" +
                        "4. Refrigerate for at least 3 hours, or up to overnight.\n" +
                        "5. Just before serving, dollop whipped cream on top of the banana pudding, then sprinkle crumbled wafer cookies on top."))
        recipes.add(Recipe(R.drawable.drumstick_pie,
                "Drumstick Pie",
                "Never sick of Drumsticks",
                "6 sugar cones\n" +
                        "6 graham crackers\n" +
                        "6 tbsp. melted butter\n" +
                        "1 tbsp. granulated sugar\n" +
                        "pinch of salt\n" +
                        "1 gal. vanilla ice cream, softened slightly\n" +
                        "5 Mini Drumsticks\n" +
                        "1 c. heavy cream\n" +
                        "1 c. chocolate chips\n" +
                        "2 tbsp. butter\n" +
                        "1/4 c. Chopped roasted peanuts",
                "1. Make ganache: Place chocolate chips in a large glass bowl. In a small saucepan, heat heavy cream until bubbles begin to form around edges. Pour hot heavy cream over chocolate chips and add butter. Let sit for 5 minutes. Whisk until smooth. Let cool while you prepare the rest of the ingredients.\n" +
                        "2. In a food processor, pulse sugar cones and graham crackers until very fine crumbs. Transfer to a large bowl and stir in butter, sugar and salt. Grease a pie dish with cooking spray, then press crust into the dish.\n" +
                        "3. Spread ice cream in any thick even layer. Top with inverted mini Drumsticks, pressing the ice cream topping into vanilla ice cream. Freeze for 30 minutes.\n" +
                        "4. Pour ganache over ice cream and around inverted Drumsticks then sprinkle chopped peanuts on top. Freeze until solid, about 4 hours."))
        recipes.add(Recipe(R.drawable.frozen_samoa_pie,
                "Frozen Samoa Pie",
                "Girl Scout cookie season may be over, but we're not giving up that easily",
                "FOR THE CRUST\n" +
                        "50 NILLA Wafers\n" +
                        "6 tbsp. melted butter\n" +
                        "1/4 c. sugar\n" +
                        "FOR THE FILLING\n" +
                        "4 oz. cream cheese, softened\n" +
                        "1 can sweetened condensed milk\n" +
                        "1 tsp. pure vanilla extract\n" +
                        "1/2 tsp. kosher salt\n" +
                        "1 c. Cool Whip, defrosted\n" +
                        "4 c. toasted coconut, divided\n" +
                        "2 c. caramel, melted and divided\n" +
                        "1 c. mini chocolate chips\n" +
                        "1 c. semisweet chocolate chips, melted",
                "1. Make crust: In a food processor, pulse Nilla wafers until they are fine crumbs. Transfer crumbs to a bowl, then add butter and sugar and stir until combined. Grease a 9\" pie plate and press in the crust mixture.\n" +
                        "2. Make filling: In a large bowl using a hand mixer, beat cream cheese until smooth. Mix in sweetened condensed milk, vanilla and salt until fully incorporated. Fold in Cool Whip.\n" +
                        "3. Make middle layer: In a medium bowl, mix 2 cups toasted coconut with 1 cup caramel.\n" +
                        "4. Pour half the cream cheese mixture into the pie pan and cover with coconut caramel. Smooth to the edges to make a layer.\n" +
                        "5. Top with the remaining cream cheese mixture, then add the remaining 2 cups toasted coconut and mini chocolate chips. Drizzle with remaining caramel and melted chocolate and freeze until firm, about 4 hours. Serve."))
        recipes.add(Recipe(R.drawable.mini_cheesecake,
                "Lemon Blueberry Mini Cheesecakes",
                "Mini cheesecakes, MASSIVE flavor",
                "12 lemon Oreos\n" +
                        "2 8-oz. bars cream cheese, softened\n" +
                        "1/2 c. powdered sugar\n" +
                        "2 tbsp. lemon juice\n" +
                        "1 tsp. lemon zest\n" +
                        "1 tsp. pure vanilla extract\n" +
                        "pinch of kosher salt\n" +
                        "2 c. heavy cream\n" +
                        "1/4 c. blueberry preserves",
                "1. Line a cupcake pan with cupcake liners then place an Oreo into the bottom of each cup. Set aside.\n" +
                        "2. In a large bowl, beat cream cheese with a hand mixer until smooth, then beat in powdered sugar, lemon juice, lemon zest, vanilla and salt. Add heavy cream and beat until fluffy and stiff peaks fork. Spoon cream cheese mixture over Oreos.\n" +
                        "3. Using a small spoon, dollop a small amount of blueberry preserves into the center of each cheesecake. Use a toothpick (or a small skewer) to swirl.\n" +
                        "4. Refrigerate until firm, about 4 hours."))
        recipes.add(Recipe(R.drawable.smores_banana_pudding,
                "S'mores Banana Pudding",
                "Two summer faves in one delicious dish",
                "1 1/3 c. whole milk\n" +
                        "1 package instant chocolate pudding mix\n" +
                        "1 14-oz. can sweetened condensed milk\n" +
                        "3 c. heavy cream\n" +
                        "1 c. marshmallow fluff, microwaved for 10 seconds\n" +
                        "1 tsp. pure vanilla extract\n" +
                        "3 c. crushed graham crackers, plus quartered graham crackers for garnish\n" +
                        "4 bananas, sliced into coins\n" +
                        "3 Hershey's chocolate bars, chopped",
                "1. Make pudding: In a large mixing bowl, combine milk, pudding mix and sweetened condensed milk. Whisk thoroughly, breaking up any lumps, and refrigerate until set, about 5 minutes.\n" +
                        "2. Make whipped cream: In another large bowl, combine heavy cream, marshmallow fluff and vanilla. Beat with a hand mixer until stiff peaks form.\n" +
                        "3. Cover the bottom of a three-quart trifle dish with a couple handfuls of crushed graham crackers. Top with one-third of the pudding, followed by a layer of banana slices. Add half of the whipped cream. Cover with marshmallows, chocolate bars and more graham crackers —you may want to also stand some graham crackers up vertically, so you see the full circle along the edge of the trifle dish.\n" +
                        "4. Repeat layering process once more, ending with a final layer of whipped cream sprinkled with marshmallows, chocolate bars and graham crackers. Refrigerate for at least 3 hours, or up to overnight."))
        recipes.add(Recipe(R.drawable.smores_cheesecake,
                "S'mores Cheesecake",
                "S'mores make everything better, even cheesecake",
                "FOR THE GANACHE\n" +
                        "1 1/2 c. chocolate chips\n" +
                        "3/4 c. heavy cream\n" +
                        "FOR THE CRUST\n" +
                        "1 sleeve graham crackers, crushed\n" +
                        "5 tbsp. melted butter\n" +
                        "1/4 c. sugar\n" +
                        "pinch of kosher salt\n" +
                        "1 sleeve of graham crackers, separated into sticks\n" +
                        "FOR THE CHEESECAKE\n" +
                        "16 oz. (2 blocks) cream cheese, softened\n" +
                        "3/4 c. powdered sugar\n" +
                        "1 1/2 c. cold heavy cream\n" +
                        "1 tsp. pure vanilla extract\n" +
                        "1/4 tsp. kosher salt\n" +
                        "mini marshmallows",
                "1. Make ganache: Place chocolate chips in a medium, heatproof bowl and set aside. Heat heavy cream in a small saucepan over medium heat. When bubbles begin to break the surface around the edges of the pan, turn off the heat.\n" +
                        "2. Pour the hot cream over chocolate chips, whisking constantly until the sauce is smooth. Let cool slightly.\n" +
                        "3. Make crust: In a large bowl, mix together graham cracker crumbs, melted butter, sugar and salt. Grease an 8” springform pan with cooking spray and press mixture into pan.\n" +
                        "4. Pour about half of the ganache over the crust, then line the graham cracker sticks around the edges of the pan standing up to form a wall.\n" +
                        "5. Make the cheesecake: In a large bowl using an electric mixer, beat cream cheese until light and fluffy, 2 minutes. Add sugar to combine, then gradually add cream and beat on high speed until stiff peaks form. Add vanilla and stir until combined.\n" +
                        "6. Pour cheesecake mixture over the ganache and smooth out with a spatula. Pour remaining ganache over the cheesecake then top with mini marshmallows.\n" +
                        "7. Freeze until firm, at least 5 hours and up to overnight.\n" +
                        "8. Right before serving, broil until the marshmallows are golden, about 2 minutes."))
        recipes.add(Recipe(R.drawable.cookie_dough_lasagna,
                "Cookie Dough Lasagna",
                "Dough-my-gosh! This is good",
                "2 sticks butter, softened\n" +
                        "1 c. sugar\n" +
                        "1 1/4 c. all-purpose flour\n" +
                        "1/4 c. milk\n" +
                        "2 tsp. pure vanilla extract\n" +
                        "1/2 tsp. kosher salt\n" +
                        "1 c. mini chocolate chips, plus more for sprinkling\n" +
                        "1 tub cool whip\n" +
                        "2 c. chocolate sauce\n" +
                        "18 graham crackers\n" +
                        "1 c. chocolate chips",
                "1. Make cookie dough: In a large bowl using a hand mixer, beat butter and sugar until smooth. Add flour, vanilla and salt and beat until just combined. Stir in mini chocolate chips.\n" +
                        "2. In a 9\"-x-13\" baking dish, lay down an even layer of graham crackers and spread about a third of cookie dough on top. Cover the cookie dough with chocolate sauce then top with another layer of graham crackers. Spread an thick, fluffy layer of Cool Whip on top then top with more graham crackers.\n" +
                        "3. Repeat layering process, reserving about 1/3 cup of cookie dough and ending with a fluffy layer of Cool Whip on top of the lasagna.\n" +
                        "4. Roll remaining cookie dough into small balls and scatter on top of the of Cool Whip. Sprinkle more mini chocolate chips on top.\n" +
                        "5. Refrigerate until the graham crackers layers have softened, about 4 hours.\n" +
                        "6. Slice into squares and serve cold."))
        recipes.add(Recipe(R.drawable.margarita_cheesecake,
                "Margarita Cheesecake Bites",
                "Think of the salty pretzel crust on these bites like a better version of the salty rim",
                "1 1/2 c. Crushed Pretzels\n" +
                        "1/2 c. (1 stick) unsalted butter, melted\n" +
                        "3 tbsp. granulated sugar\n" +
                        "16 oz. cream cheese, softened\n" +
                        "1 c. powdered sugar\n" +
                        "Juice and zest of 1 lime, reserving some zest for topping\n" +
                        "2 tbsp. tequila\n" +
                        "1 tsp. pure vanilla extract\n" +
                        "Large pinch of kosher salt",
                "1. Line a 9”-x-9” baking dish with two strips of parchment paper, leaving an overhang.\n" +
                        "2. In a large bowl, mix together pretzels, butter, and granulated sugar until combined. Press in an even layer into the bottom of the baking dish. Freeze for 10 minutes.\n" +
                        "3. Meanwhile, in a large bowl using a hand mixer, beat cream cheese and powdered sugar until light and fluffy. Then, mix in lime juice and zest, tequila, vanilla, and salt until creamy and smooth. Spread evenly on top of the pretzel crust. Top with more lime zest.\n" +
                        "4. Freeze until set, about 1 hour more. Once firm, remove from baking dish and cut into 16 bite-size pieces. Keep in freezer until ready to serve."))

        val adapter = DataAdapter(recipes)
        recyclerView!!.adapter = adapter
        recyclerView!!.addItemDecoration(DividerItemDecoration(recyclerView.getContext(), LinearLayoutManager.VERTICAL))
    }
}
