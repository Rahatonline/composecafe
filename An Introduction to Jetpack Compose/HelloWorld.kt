class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            MyApp()

        }

    }

}


@Composable

fun MyApp() {

    Column {

        Text("Hello, World!")

    }


}  
