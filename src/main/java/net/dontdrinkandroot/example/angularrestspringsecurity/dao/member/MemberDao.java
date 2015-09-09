package net.dontdrinkandroot.example.angularrestspringsecurity.dao.member;

import net.dontdrinkandroot.example.angularrestspringsecurity.dao.Dao;
import net.dontdrinkandroot.example.angularrestspringsecurity.entity.Member;
import net.dontdrinkandroot.example.angularrestspringsecurity.entity.NewsEntry;


/**
 * Definition of a Data Access Object that can perform CRUD Operations for {@link NewsEntry}s.
 * 
 * @author Philip W. Sorst <philip@sorst.net>
 */
public interface MemberDao extends Dao<Member, Long>
{

}