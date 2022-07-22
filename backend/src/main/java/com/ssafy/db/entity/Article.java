package com.ssafy.db.entity;

import javax.persistence.Entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Getter;
import lombok.Setter;

/**
 * 모집 게시글 모델 정의.
 */
@Entity
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
public class Article extends BaseEntity {
	@OnDelete(action = OnDeleteAction.CASCADE)
	long user_pk;
	@OnDelete(action = OnDeleteAction.CASCADE)
	long study_pk;
	String state;
	String category;
	String title;
	String content;
	String date;
	int recruitment;
	int hit;
	
	String name;
}