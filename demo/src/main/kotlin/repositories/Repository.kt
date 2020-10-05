package repositories

import org.springframework.data.jpa.repository.JpaRepository

interface Repository : JpaRepository<User, Int> {
}