package model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="category")
public class CategoryEntity {
		@Id
		@Column(name="c_id")
		private String cid;
		
		@Column(name="c_name")
		private String cname;
		
		@OneToMany(mappedBy="cid")
		private List<SpecificEntity> specifics;
}
