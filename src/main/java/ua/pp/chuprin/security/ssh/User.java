package ua.pp.chuprin.security.ssh;

public class User {

	public final String user;
	public final String publicKeyPath;
	public final String privateKeyPath;
	public final String passphrase;

	public User(String user, String publicKeyPath, String privateKeyPath) {
		this(user, publicKeyPath, privateKeyPath, null);
	}

	public User(String user, String publicKeyPath, String privateKeyPath, String passphrase) {
		this.user = user;
		this.publicKeyPath = publicKeyPath;
		this.privateKeyPath = privateKeyPath;
		this.passphrase = passphrase;
	}
}
