package unpar.ftis.ejuklakapp;
import android.view.View;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.support.v4.widget.DrawerLayout;
import android.webkit.*;
public class MainActivity extends ActionBarActivity implements
		NavigationDrawerFragment.NavigationDrawerCallbacks {

	/**
	 * Fragment managing the behaviors, interactions and presentation of the
	 * navigation drawer.
	 */
	private NavigationDrawerFragment mNavigationDrawerFragment;

	/**
	 * Used to store the last screen title. For use in
	 * {@link #restoreActionBar()}.
	 */
	private CharSequence mTitle;
	private static WebView web;
	private String path;
	private String stHtml;
	private String []arrBab;
	private String []arrString;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		web = (WebView) findViewById(R.id.webview);
		
		//WebSettings WS = web.getSettings();
		//WS.setJavaScriptEnabled(true);
		
		//web.setWebViewClient(new MyWebView());
		//web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		
		//web.loadUrl("file:///android_asset/Bab1.html");
		
		mNavigationDrawerFragment = (NavigationDrawerFragment) getSupportFragmentManager()
				.findFragmentById(R.id.navigation_drawer);
		mTitle = getTitle();
		
		//isi array bab
		this.arrBab = new String[70];
		//eJuklak
		arrBab[1] = "eJuklak.html";
		//kata pengantar
		arrBab[2] = "eJuklak.html#kata-pengantar-dekan-fakultas-teknologi-informasi-dan-sains-universitas-katolik-parahyangan";
		//bab1
		arrBab[3] = "eJuklak.html#bab-1-pendahuluan";
		arrBab[4] = "eJuklak.html#sejarah-fakultas-teknologi-informasi-dan-sains";
		arrBab[5] = "eJuklak.html#visi-misi-tujuan-dan-sasaran-ftis";
		arrBab[6] = "eJuklak.html#visi-ftis";
		arrBab[7] = "eJuklak.html#misi-ftis";
		arrBab[8] = "eJuklak.html#tujuan-ftis";
		arrBab[9] = "eJuklak.html#sasaran-ftis";
		arrBab[10]= "eJuklak.html#keberhasilan-ftis";
		arrBab[11] = "eJuklak.html#pengelola-fakultas";
		arrBab[12] = "eJuklak.html#daftar-dosen-ftis";
		//bab2
		arrBab[13] = "eJuklak.html#bab-2-penyelenggaraan-mata-kuliah";
		arrBab[14] = "eJuklak.html#mata-kuliah-pilihan";
		arrBab[15] = "eJuklak.html#mata-kuliah-prasyarat";
		arrBab[16] = "eJuklak.html#mata-kuliah-layanan";
		arrBab[17] = "eJuklak.html#kuliah-layanan-progam-studi-matematika";
		arrBab[18] = "eJuklak.html#kuliah-layanan-progam-studi-fisika";
		arrBab[19] = "eJuklak.html#kuliah-layanan-progam-studi-teknik-informatika";
		arrBab[20]= "eJuklak.html#mata-kuliah-umum";
		arrBab[21] = "eJuklak.html#susunan-mata-kuliah-umum";
		arrBab[22] = "eJuklak.html#uraian-singkat-mata-kuliah-umum";
		arrBab[23] = "eJuklak.html#kurikulum-program-studi-matematika";
		arrBab[24] = "eJuklak.html#susunan-mata-kuliah";
		arrBab[25] = "eJuklak.html#mata-kuliah-pilihan-progam-studi-matematika";
		arrBab[26] = "eJuklak.html#peta-dan-prasyarat-mata-kuliah";
		arrBab[27] = "eJuklak.html#deskripsi-singkat-mata-kuliah-program-studi-matematika";
		arrBab[28] = "eJuklak.html#kurikulum-program-studi-fisika";
		arrBab[29] = "eJuklak.html#susunan-mata-kuliah-1";
		arrBab[30]= "eJuklak.html#mata-kuliah-pilihan-program-studi-fisika";
		arrBab[31] = "eJuklak.html#peta-dan-prasyarat-matakuliah";
		arrBab[32] = "eJuklak.html#deskripsi-singkat-matakuliah-program-studi-fisika";
		arrBab[33] = "eJuklak.html#kurikulum-program-studi-teknik-informatika";
		arrBab[34] = "eJuklak.html#sususan-mata-kuliah";
		arrBab[35] = "eJuklak.html#mata-kuliah-pilihan-program-studi-teknik-informatika";
		arrBab[36] = "eJuklak.html#peta-dan-prasyarat-mata-kuliah-1";
		arrBab[37] = "eJuklak.html#deskripsi-mata-kuliah";
		//bab3
		arrBab[38] = "eJuklak.html#bab-3-kegiatan-akademik";
		arrBab[39] = "eJuklak.html#penyusun-rencana-studi";
		arrBab[40]= "eJuklak.html#perwalian-dan-penentuan-mata-kuliah";
		arrBab[41] = "eJuklak.html#pendaftaran-mata-kuliah";
		arrBab[42] = "eJuklak.html#tahap-awal-perkuliahan";
		arrBab[43] = "eJuklak.html#perubahan-rencana-studi";
		arrBab[44] = "eJuklak.html#kegiatan-perkuliahan";
		arrBab[45] = "eJuklak.html#tata-cara-ujian";
		arrBab[46] = "eJuklak.html#syarat-mengikuti-ujian";
		arrBab[47] = "eJuklak.html#tata-tertib-ujian";
		arrBab[48] = "eJuklak.html#sanksi";
		arrBab[49] = "eJuklak.html#lain-lain-2";
		arrBab[50]= "eJuklak.html#cuti-dan-gencat-studi";
		arrBab[51] = "eJuklak.html#persyaratan-cuti-studi";
		arrBab[52] = "eJuklak.html#prosedur-cuti-studi";
		arrBab[53] = "eJuklak.html#gencat-studi";
		arrBab[54] = "eJuklak.html#pengunduran-diri-sebagai-mahasiswa";
		//bab4
		arrBab[55] = "eJuklak.html#bab-4-evaluasi-keberhasilan-belajar";
		arrBab[56] = "eJuklak.html#evaluasi-keberhasilan-belajar";
		arrBab[57] = "eJuklak.html#evaluasi-keberhasilan-belajar-dalam-suatu-tahap-belajar";
		arrBab[58] = "eJuklak.html#evaluasi-keberhasilan-belajar-tiap-semester";
		arrBab[59] = "eJuklak.html#evaluasi-keberhasilan-belajar-tahap-pertama";
		arrBab[60]= "eJuklak.html#evaluasi-keberhasilan-belajar-tahap-kedua";
		arrBab[61] = "eJuklak.html#evaluasi-keberhasilan-belajar-tahap-akhir";
		arrBab[62] = "eJuklak.html#kemampuan-bahasa-inggris-mahasiswa-unpar";
		arrBab[63] = "eJuklak.html#lampiran-1";
		arrBab[64] = "eJuklak.html#lampiran-2";
		arrBab[65] = "eJuklak.html#lampiran-3";
		arrBab[66] = "eJuklak.html#lampiran-4";
		arrBab[67] = "eJuklak.html#lampiran-5";
		arrBab[68] = "eJuklak.html#lampiran-6";
		arrBab[69] = "eJuklak.html#lampiran-7";
		//isi array string
		this.arrString = new String[70];
		arrString[1] = getString(R.string.title_sectionHome);
		//kata pengantar
		arrString[2] = getString(R.string.title_section1);
		//bab1
		arrString[3] = getString(R.string.title_section2);
		arrString[4] = getString(R.string.title_section2_1);
		arrString[5] = getString(R.string.title_section2_2);
		arrString[6] = getString(R.string.title_section2_3);
		arrString[7] = getString(R.string.title_section2_4);
		arrString[8] = getString(R.string.title_section2_5);
		arrString[9] = getString(R.string.title_section2_6);
		arrString[10] = getString(R.string.title_section2_Keberhasilan);		
		arrString[11] = getString(R.string.title_section2_7);
		arrString[12] = getString(R.string.title_section2_8);
		//bab2
		arrString[13] = getString(R.string.title_section3);
		arrString[14] = getString(R.string.title_section3_1);
		arrString[15] = getString(R.string.title_section3_2);
		arrString[16] = getString(R.string.title_section3_3);
		arrString[17] = getString(R.string.title_section3_4);
		arrString[18] = getString(R.string.title_section3_5);
		arrString[19] = getString(R.string.title_section3_6);
		arrString[20] = getString(R.string.title_section3_7);
		arrString[21] = getString(R.string.title_section3_8);
		arrString[22] = getString(R.string.title_section3_9);
		arrString[23] = getString(R.string.title_section3_10);
		arrString[24] = getString(R.string.title_section3_11);
		arrString[25] = getString(R.string.title_section3_12);
		arrString[26] = getString(R.string.title_section3_13);
		arrString[27] = getString(R.string.title_section3_14);
		arrString[28] = getString(R.string.title_section3_15);
		arrString[29] = getString(R.string.title_section3_16);
		arrString[30] = getString(R.string.title_section3_17);
		arrString[31] = getString(R.string.title_section3_18);
		arrString[32] = getString(R.string.title_section3_19);
		arrString[33] = getString(R.string.title_section3_20);
		arrString[34] = getString(R.string.title_section3_21);
		arrString[35] = getString(R.string.title_section3_22);
		arrString[36] = getString(R.string.title_section3_23);
		arrString[37] = getString(R.string.title_section3_24);
		//bab3
		arrString[38] = getString(R.string.title_section4);
		arrString[39] = getString(R.string.title_section4_1);
		arrString[40] = getString(R.string.title_section4_2);
		arrString[41] = getString(R.string.title_section4_3);
		arrString[42] = getString(R.string.title_section4_4);
		arrString[43] = getString(R.string.title_section4_5);
		arrString[44] = getString(R.string.title_section4_6);
		arrString[45] = getString(R.string.title_section4_7);
		arrString[46] = getString(R.string.title_section4_8);
		arrString[47] = getString(R.string.title_section4_9);
		arrString[48] = getString(R.string.title_section4_10);
		arrString[49] = getString(R.string.title_section4_11);
		arrString[50] = getString(R.string.title_section4_12);
		arrString[51] = getString(R.string.title_section4_13);
		arrString[52] = getString(R.string.title_section4_14);
		arrString[53] = getString(R.string.title_section4_15);
		arrString[54] = getString(R.string.title_section4_16);
		//bab4
		arrString[55] = getString(R.string.title_section5);
		arrString[56] = getString(R.string.title_section5_1);
		arrString[57] = getString(R.string.title_section5_2);
		arrString[58] = getString(R.string.title_section5_3);
		arrString[59] = getString(R.string.title_section5_4);
		arrString[60] = getString(R.string.title_section5_5);
		arrString[61] = getString(R.string.title_section5_6);
		arrString[62] = getString(R.string.title_section5_7);
		arrString[63] = getString(R.string.title_section5_8);
		arrString[64] = getString(R.string.title_section5_9);
		arrString[65] = getString(R.string.title_section5_10);
		arrString[66] = getString(R.string.title_section5_11);
		arrString[67] = getString(R.string.title_section5_12);
		arrString[68] = getString(R.string.title_section5_13);
		arrString[69] = getString(R.string.title_section5_14);
		
		// Set up the drawer.
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
				(DrawerLayout) findViewById(R.id.drawer_layout));
	}

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		// update the main content by replacing fragments
		FragmentManager fragmentManager = getSupportFragmentManager();
			fragmentManager
			.beginTransaction()
			.replace(R.id.container,
					PlaceholderFragment.newInstance(position + 1)).commit();
		
		
	}

	public void onSectionAttached(int number) {
		mTitle = arrString[number];
		web.loadUrl("file:///android_asset/"+arrBab[number]);
	}

	public void restoreActionBar() {
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.setTitle(mTitle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		if (!mNavigationDrawerFragment.isDrawerOpen()) {
			// Only show items in the action bar relevant to this screen
			// if the drawer is not showing. Otherwise, let the drawer
			// decide what to show in the action bar.
			getMenuInflater().inflate(R.menu.main, menu);
			restoreActionBar();
			return true;
		}
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static PlaceholderFragment newInstance(int sectionNumber) {
			PlaceholderFragment fragment = new PlaceholderFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);
			return fragment;
		}

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			
			return rootView;
		}

		@Override
		public void onAttach(Activity activity) {
			super.onAttach(activity);
			((MainActivity) activity).onSectionAttached(getArguments().getInt(
					ARG_SECTION_NUMBER));
		}
	}

}
