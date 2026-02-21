let cart = JSON.parse(localStorage.getItem("cart")) || [];

// Feature 1: Add to Cart
function addToCart(product, price) {
  cart.push({ product, price });
  localStorage.setItem("cart", JSON.stringify(cart));
  alert(product + " Press OK to confirm");
}

// Feature 2: Display Cart Items & Total
function displayCart() {
  let cartItems = document.getElementById("cartItems");
  let totalPrice = document.getElementById("totalPrice");

  if (!cartItems) return;

  cartItems.innerHTML = "";
  let total = 0;

  cart.forEach(item => {
    let li = document.createElement("li");
    li.textContent = `${item.product} - ₹${item.price}`;
    cartItems.appendChild(li);
    total += item.price;
  });

  totalPrice.textContent = "Total: ₹" + total;
}

// Feature 3: Clear Cart
function clearCart() {
  localStorage.clear();
  cart = [];
  displayCart();
}

displayCart();