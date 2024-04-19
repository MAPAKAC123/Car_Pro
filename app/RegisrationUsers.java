public class RegisrationUsers {
    public String  name, familia, otchestvo, email, login, password;
    public String id, phone;
    public RegisrationUsers(){

    }

    public RegisrationUsers(String id, String phone, String name, String familia, String otchestvo, String email, String login, String password)
    {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.familia = familia;
        this.otchestvo = otchestvo;
        this.email = email;
        this.login = login;
        this.password = password;
    }
}