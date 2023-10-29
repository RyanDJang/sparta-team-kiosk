package main.domain.order;

import java.time.Instant;
import main.domain.cart.Cart;

public class Order {
    //============================================필드
    private double totalPrice;              // 1총가격
    private Cart cart;                      // 2 장바구니(=주문 상품 목록)
    private String requestMessage;          // 3 요청사항
    private Instant orderDateTime;          // 4 주문 일시
    private int waitingNumber = 0;           // 5 대기번호

    //====================================================생성자
    public Order(double totalPrice, Cart cart, String requestMessage, Instant orderDateTime, int waitingNumber) {
        this.totalPrice = cart.getTotalPrice();
        this.cart = cart;
        this.requestMessage = requestMessage;
        this.orderDateTime = orderDateTime;
        this.waitingNumber = waitingNumber;
    }

    //=================================================메서드 구역
    public Cart getCart() {
        return cart;
    }                                       // 2 장바구니

    public String getRequestMessage() {
        return requestMessage;
    }                                       // 3 요청사항

    public Instant getOrderDateTime() {
        return orderDateTime;
    }                                       //4 주문 일시

    public int getWaitingNumber() {
        return waitingNumber;
    }                                       //5 대기번호

    public double getTotalPrice() {
        return totalPrice;
    }

    public void inputRequestMessage(String message) throws IllegalArgumentException {
        if (message.length() > 20) {
            throw new IllegalArgumentException("20자 이내로 작성해주세요.");
        }
        this.requestMessage = message;
    }                                       // 요청사항 메세지 입력

    public final int issueWaitingNumber() {
        this.waitingNumber += 1;
        return waitingNumber;
    }                                       // 대기번호 발급


}