package com.bookshopweb.dto;

import java.util.List;
import java.util.StringJoiner;

public class CartResponse {
    private final long id;
    private final long userId;
    private final List<CartItemResponse> cartItems;

    public CartResponse(long id, long userId, List<CartItemResponse> cartItems) {
        this.id = id;
        this.userId = userId;
        this.cartItems = cartItems;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public List<CartItemResponse> getCartItems() {
        return cartItems;
    }

	@Override
	public String toString() {
		return "CartResponse [id=" + id + ", userId=" + userId + ", cartItems=" + cartItems + "]";
	}

   
}
