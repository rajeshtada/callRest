package com.example.callRest.entity;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class CustomUserDetails implements UserDetails {

		private static final long serialVersionUID = 1L;

		private User user;
		
		public CustomUserDetails(User user) {
			this.user = user;
		}
		
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
//			return	AuthorityUtils.NO_AUTHORITIES;
			HashSet<SimpleGrantedAuthority> set = new HashSet<>();
			set.add(new SimpleGrantedAuthority(this.user.getRole()));
			
			return set;
		}

		@Override
		public String getPassword() {
			return this.user.getPassword();
		}

		@Override
		public String getUsername() {
			return this.user.getUserName();
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return this.user.isAccountnonlocked();
		}

		@Override
		public boolean isCredentialsNonExpired() {
			LocalDate passGeneDate = user.getPassGeneDate();
			LocalDate now = LocalDate.now();
//			int days = Period.between(passGeneDate, now).getDays();
//			Period between = Period.between(passGeneDate, now);
//			int daysgap = between.getYears()*365+between.getMonths()*30+between.getDays();
//			long l = now.toEpochDay()-passGeneDate.toEpochDay()
			if(now.toEpochDay()-passGeneDate.toEpochDay()<=90) {
				return true;	
			}else {
				return false;
			}
			
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}
		

}
