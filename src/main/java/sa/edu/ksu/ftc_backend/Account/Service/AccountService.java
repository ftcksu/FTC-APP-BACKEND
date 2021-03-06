package sa.edu.ksu.ftc_backend.Account.Service;
import sa.edu.ksu.ftc_backend.Account.Account;
import java.util.Optional;

public interface AccountService {
     public Account save(Account account);
    public Optional<Account> findById(Integer id);
    public Account update(Account account);
    public void delete(Integer id);
    public Iterable<Account> findAll();
}
