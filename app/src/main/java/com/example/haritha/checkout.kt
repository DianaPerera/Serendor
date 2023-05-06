package com.example.haritha


    class CheckoutActivity : AppCompatActivity() {

        private lateinit var itemNameTextView: TextView
        private lateinit var itemPriceTextView: TextView
        private lateinit var nameInput: EditText
        private lateinit var emailInput: EditText
        private lateinit var checkoutButton: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_checkout)

            itemNameTextView = findViewById(R.id.item_name)
            itemPriceTextView = findViewById(R.id.item_price)
            nameInput = findViewById(R.id.name_input)
            emailInput = findViewById(R.id.email_input)
            checkoutButton = findViewById(R.id.checkout_button)

            itemNameTextView.text = "Item Name"
            itemPriceTextView.text = "Item Price"

            checkoutButton.setOnClickListener {
                val name = nameInput.text.toString()
                val email = emailInput.text.toString()
                val price = 10.0 // Replace with actual price
                performCheckout(name, email, price)
            }
        }

        private fun performCheckout(name: String, email: String, price: Double) {
            // Use payment processing APIs or third-party services to process payment
            // ...
            // If payment is successful, show success message and return to previous activity
            Toast.makeText(this, "Payment successful", Toast.LENGTH_SHORT).show()
            finish()

    }
