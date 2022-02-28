package krud.shop.adapter;

import krud.shop.model.UserData;
import krud.shop.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryAdapter extends UserRepository, JpaRepository<Long, UserData> {
}
