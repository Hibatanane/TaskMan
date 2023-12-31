package Repository;

import Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    boolean existsByEmailOrTel( String email, String tel);



    boolean existsByNomAndPrenomAndProfessionAndDatenAndTelAndType(String nom,  String prenom, String profession, String daten, String tel, String type);

    boolean existsByNomAndIdNot(String nom, Integer id);

    boolean existsByTelAndIdNot(String tel , Integer id);

    boolean existsByPassword(String password);


    List<Utilisateur> findAllByIsDeletedAndType(String isDeleted, String type);

    long countByTypeAndIsDeleted(String type , String isDeleted);


    Optional<Utilisateur> getUtilisateurById(Integer id);

}
