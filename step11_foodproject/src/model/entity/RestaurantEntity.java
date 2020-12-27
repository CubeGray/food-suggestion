package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="restaurant")
public class RestaurantEntity {
		
		@Id
		@Column(name="r_id")
		private String rid;
		
		@Column(name="r_name")
		private String rname;
		
		@ManyToOne
		@JoinColumn(name="s_id")
		private SpecificEntity sid;
		
		@Column(name="map_link")
		private String maplink;
		
		@Column(name="page_link")
		private String pagelink;				
}
