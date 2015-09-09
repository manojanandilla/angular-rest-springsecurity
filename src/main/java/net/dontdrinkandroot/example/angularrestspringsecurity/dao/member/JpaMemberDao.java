package net.dontdrinkandroot.example.angularrestspringsecurity.dao.member;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import net.dontdrinkandroot.example.angularrestspringsecurity.dao.Dao;
import net.dontdrinkandroot.example.angularrestspringsecurity.dao.JpaDao;
import net.dontdrinkandroot.example.angularrestspringsecurity.entity.Member;
import net.dontdrinkandroot.example.angularrestspringsecurity.entity.NewsEntry;

import org.springframework.transaction.annotation.Transactional;


/**
 * JPA Implementation of a {@link MemberDao}.
 * 
 * @author Philip W. Sorst <philip@sorst.net>
 */
public class JpaMemberDao extends JpaDao<Member, Long>  implements MemberDao
{

	public JpaMemberDao()
	{
		super(Member.class);
	}


	@Override
	@Transactional(readOnly = true)
	public List<Member> findAll()
	{
		final CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
		final CriteriaQuery<Member> criteriaQuery = builder.createQuery(Member.class);

		Root<Member> root = criteriaQuery.from(Member.class);
		criteriaQuery.orderBy(builder.desc(root.get("date")));

		TypedQuery<Member> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
		return typedQuery.getResultList();
	}

}
