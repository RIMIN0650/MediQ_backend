package com.be24.api.waiting.domain;

public class Waiting {

    public static class Order{
        private int orderIdx;
        private int userId;
        private int hospitalId;
        private int order;

        public Order() {
        }

        public Order(int orderIdx, int userId, int hospitalId, int order) {
            this.orderIdx = orderIdx;
            this.userId = userId;
            this.hospitalId = hospitalId;
            this.order = order;
        }

        public int getOrderIdx() {
            return orderIdx;
        }

        public void setOrderIdx(int orderIdx) {
            this.orderIdx = orderIdx;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getHospitalId() {
            return hospitalId;
        }

        public void setHospitalId(int hospitalId) {
            this.hospitalId = hospitalId;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }
    }
}