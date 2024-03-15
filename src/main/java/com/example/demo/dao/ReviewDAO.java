package com.example.demo.dao;

import com.example.demo.entity.Review;

import java.util.List;

public interface ReviewDAO {
    List<Review> findReviews();

    void deleteReviewById(int theId);

    void saveReview(Review review);

    Review updateReview(Review review);

    Review findReviewById(int theId);
}
