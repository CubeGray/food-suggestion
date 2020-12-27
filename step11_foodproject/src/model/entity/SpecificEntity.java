package model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name="specific")
public class SpecificEntity {
	
	@Id
	@Column(name="s_id")
	private String sid;
	
	@Column(name="s_name")
	private String sname;
	
	@ManyToOne
	@JoinColumn(name="c_id")
	private CategoryEntity cid;
	
	@OneToMany(mappedBy="sid")	
	private List<RestaurantEntity> restaurants;
}
