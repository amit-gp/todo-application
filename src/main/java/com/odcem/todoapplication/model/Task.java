package com.odcem.todoapplication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.odcem.todoapplication.enums.TaskStatusEnum;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


/**
 * @author Amit Kumar Gupta
 * The task model which represents a single task
 */

@Entity
@Table(name = "task")
@Data 
@RequiredArgsConstructor
@NoArgsConstructor
public class Task {
	
	@Id
	@NonNull private int id;
	@NonNull private String title;
	@NonNull private String description;

	@Enumerated(EnumType.STRING)
	@NonNull private TaskStatusEnum status;
	
//	@Column(name = "deadlineDate")
//	@Temporal(TemporalType.DATE)
//	@NonNull private Date deadlineDate;
//
//	@Column(name = "creationDate")
//	@Temporal(TemporalType.DATE)
//	@NonNull private final Date creationDate;

}
