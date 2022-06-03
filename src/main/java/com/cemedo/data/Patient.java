package  com.cemedo.data;
// Generated 1 juin 2022 � 14:01:29 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Patient generated by hbm2java
 */
@Entity
@Table(name = "patient", catalog = "heroku_88ae11bd39df693")
public class Patient implements java.io.Serializable {

	private Integer idPatients;
	private Assurance assurance;
	private String nomPatients;
	private String prenomPatients;
	private String genrePatients;
	private Date dateNaissancePatients;
	private String emailPatients;
	private String professionPatients;
	private String telephone1Patients;
	private String telephone2Patients;
	private String numeroAssurancePatients;
	private float pourcentageAssurancePatients;
	private String residencePatients;
	private String numeroCniPatients;
	private String passwordPatients;
	private String photoPatient;
	private Set<Rapport> rapports = new HashSet<Rapport>(0);
	private Set<Antecedant> antecedants = new HashSet<Antecedant>(0);
	private Set<Appl> appls = new HashSet<Appl>(0);
	private Set<Chat> chats = new HashSet<Chat>(0);
	private Set<Rendezvous> rendezvouses = new HashSet<Rendezvous>(0);
	private Set<Famille> familles = new HashSet<Famille>(0);
	private Set<Dossier> dossiers = new HashSet<Dossier>(0);
	private Set<Consultation> consultations = new HashSet<Consultation>(0);
	private Set<Facturepatient> facturepatients = new HashSet<Facturepatient>(0);
	private Set<Adresse> adresses = new HashSet<Adresse>(0);
	private Set<Livraison> livraisons = new HashSet<Livraison>(0);
	private Set<Examen> examens = new HashSet<Examen>(0);
	private Set<Ordonnance> ordonnances = new HashSet<Ordonnance>(0);

	public Patient() {
	}

	public Patient(String nomPatients, String prenomPatients, String genrePatients, Date dateNaissancePatients,
			String emailPatients, String professionPatients, String telephone1Patients, String telephone2Patients,
			String numeroAssurancePatients, float pourcentageAssurancePatients, String residencePatients,
			String numeroCniPatients, String passwordPatients) {
		this.nomPatients = nomPatients;
		this.prenomPatients = prenomPatients;
		this.genrePatients = genrePatients;
		this.dateNaissancePatients = dateNaissancePatients;
		this.emailPatients = emailPatients;
		this.professionPatients = professionPatients;
		this.telephone1Patients = telephone1Patients;
		this.telephone2Patients = telephone2Patients;
		this.numeroAssurancePatients = numeroAssurancePatients;
		this.pourcentageAssurancePatients = pourcentageAssurancePatients;
		this.residencePatients = residencePatients;
		this.numeroCniPatients = numeroCniPatients;
		this.passwordPatients = passwordPatients;
	}

	public Patient(Assurance assurance, String nomPatients, String prenomPatients, String genrePatients,
			Date dateNaissancePatients, String emailPatients, String professionPatients, String telephone1Patients,
			String telephone2Patients, String numeroAssurancePatients, float pourcentageAssurancePatients,
			String residencePatients, String numeroCniPatients, String passwordPatients, String photoPatient,
			Set<Rapport> rapports, Set<Antecedant> antecedants, Set<Appl> appls, Set<Chat> chats,
			Set<Rendezvous> rendezvouses, Set<Famille> familles, Set<Dossier> dossiers, Set<Consultation> consultations,
			Set<Facturepatient> facturepatients, Set<Adresse> adresses, Set<Livraison> livraisons, Set<Examen> examens,
			Set<Ordonnance> ordonnances) {
		this.assurance = assurance;
		this.nomPatients = nomPatients;
		this.prenomPatients = prenomPatients;
		this.genrePatients = genrePatients;
		this.dateNaissancePatients = dateNaissancePatients;
		this.emailPatients = emailPatients;
		this.professionPatients = professionPatients;
		this.telephone1Patients = telephone1Patients;
		this.telephone2Patients = telephone2Patients;
		this.numeroAssurancePatients = numeroAssurancePatients;
		this.pourcentageAssurancePatients = pourcentageAssurancePatients;
		this.residencePatients = residencePatients;
		this.numeroCniPatients = numeroCniPatients;
		this.passwordPatients = passwordPatients;
		this.photoPatient = photoPatient;
		this.rapports = rapports;
		this.antecedants = antecedants;
		this.appls = appls;
		this.chats = chats;
		this.rendezvouses = rendezvouses;
		this.familles = familles;
		this.dossiers = dossiers;
		this.consultations = consultations;
		this.facturepatients = facturepatients;
		this.adresses = adresses;
		this.livraisons = livraisons;
		this.examens = examens;
		this.ordonnances = ordonnances;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id_Patients", unique = true, nullable = false)
	public Integer getIdPatients() {
		return this.idPatients;
	}

	public void setIdPatients(Integer idPatients) {
		this.idPatients = idPatients;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Assurances_id_Assurance")
	public Assurance getAssurance() {
		return this.assurance;
	}

	public void setAssurance(Assurance assurance) {
		this.assurance = assurance;
	}

	@Column(name = "nom_patients", nullable = false, length = 45)
	public String getNomPatients() {
		return this.nomPatients;
	}

	public void setNomPatients(String nomPatients) {
		this.nomPatients = nomPatients;
	}

	@Column(name = "prenom_patients", nullable = false, length = 45)
	public String getPrenomPatients() {
		return this.prenomPatients;
	}

	public void setPrenomPatients(String prenomPatients) {
		this.prenomPatients = prenomPatients;
	}

	@Column(name = "genre_patients", nullable = false, length = 45)
	public String getGenrePatients() {
		return this.genrePatients;
	}

	public void setGenrePatients(String genrePatients) {
		this.genrePatients = genrePatients;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_naissance_patients", nullable = false, length = 26)
	public Date getDateNaissancePatients() {
		return this.dateNaissancePatients;
	}

	public void setDateNaissancePatients(Date dateNaissancePatients) {
		this.dateNaissancePatients = dateNaissancePatients;
	}

	@Column(name = "email_patients", nullable = false, length = 45)
	public String getEmailPatients() {
		return this.emailPatients;
	}

	public void setEmailPatients(String emailPatients) {
		this.emailPatients = emailPatients;
	}

	@Column(name = "profession_patients", nullable = false, length = 45)
	public String getProfessionPatients() {
		return this.professionPatients;
	}

	public void setProfessionPatients(String professionPatients) {
		this.professionPatients = professionPatients;
	}

	@Column(name = "telephone1_patients", nullable = false, length = 100)
	public String getTelephone1Patients() {
		return this.telephone1Patients;
	}

	public void setTelephone1Patients(String telephone1Patients) {
		this.telephone1Patients = telephone1Patients;
	}

	@Column(name = "telephone2_patients", nullable = false, length = 100)
	public String getTelephone2Patients() {
		return this.telephone2Patients;
	}

	public void setTelephone2Patients(String telephone2Patients) {
		this.telephone2Patients = telephone2Patients;
	}

	@Column(name = "numero_assurance_patients", nullable = false, length = 100)
	public String getNumeroAssurancePatients() {
		return this.numeroAssurancePatients;
	}

	public void setNumeroAssurancePatients(String numeroAssurancePatients) {
		this.numeroAssurancePatients = numeroAssurancePatients;
	}

	@Column(name = "pourcentage_assurance_patients", nullable = false, precision = 12, scale = 0)
	public float getPourcentageAssurancePatients() {
		return this.pourcentageAssurancePatients;
	}

	public void setPourcentageAssurancePatients(float pourcentageAssurancePatients) {
		this.pourcentageAssurancePatients = pourcentageAssurancePatients;
	}

	@Column(name = "residence_patients", nullable = false, length = 45)
	public String getResidencePatients() {
		return this.residencePatients;
	}

	public void setResidencePatients(String residencePatients) {
		this.residencePatients = residencePatients;
	}

	@Column(name = "numero_CNI_patients", nullable = false, length = 100)
	public String getNumeroCniPatients() {
		return this.numeroCniPatients;
	}

	public void setNumeroCniPatients(String numeroCniPatients) {
		this.numeroCniPatients = numeroCniPatients;
	}

	@Column(name = "password_patients", nullable = false, length = 45)
	public String getPasswordPatients() {
		return this.passwordPatients;
	}

	public void setPasswordPatients(String passwordPatients) {
		this.passwordPatients = passwordPatients;
	}

	@Column(name = "photo_patient", length = 45)
	public String getPhotoPatient() {
		return this.photoPatient;
	}

	public void setPhotoPatient(String photoPatient) {
		this.photoPatient = photoPatient;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "patient")
	public Set<Rapport> getRapports() {
		return this.rapports;
	}

	public void setRapports(Set<Rapport> rapports) {
		this.rapports = rapports;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "patient")
	public Set<Antecedant> getAntecedants() {
		return this.antecedants;
	}

	public void setAntecedants(Set<Antecedant> antecedants) {
		this.antecedants = antecedants;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<Appl> getAppls() {
		return this.appls;
	}

	public void setAppls(Set<Appl> appls) {
		this.appls = appls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<Chat> getChats() {
		return this.chats;
	}

	public void setChats(Set<Chat> chats) {
		this.chats = chats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<Rendezvous> getRendezvouses() {
		return this.rendezvouses;
	}

	public void setRendezvouses(Set<Rendezvous> rendezvouses) {
		this.rendezvouses = rendezvouses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<Famille> getFamilles() {
		return this.familles;
	}

	public void setFamilles(Set<Famille> familles) {
		this.familles = familles;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "patient")
	public Set<Dossier> getDossiers() {
		return this.dossiers;
	}

	public void setDossiers(Set<Dossier> dossiers) {
		this.dossiers = dossiers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<Consultation> getConsultations() {
		return this.consultations;
	}

	public void setConsultations(Set<Consultation> consultations) {
		this.consultations = consultations;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "patient")
	public Set<Facturepatient> getFacturepatients() {
		return this.facturepatients;
	}

	public void setFacturepatients(Set<Facturepatient> facturepatients) {
		this.facturepatients = facturepatients;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<Adresse> getAdresses() {
		return this.adresses;
	}

	public void setAdresses(Set<Adresse> adresses) {
		this.adresses = adresses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<Livraison> getLivraisons() {
		return this.livraisons;
	}

	public void setLivraisons(Set<Livraison> livraisons) {
		this.livraisons = livraisons;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "patient")
	public Set<Examen> getExamens() {
		return this.examens;
	}

	public void setExamens(Set<Examen> examens) {
		this.examens = examens;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "patient")
	public Set<Ordonnance> getOrdonnances() {
		return this.ordonnances;
	}

	public void setOrdonnances(Set<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}

}
