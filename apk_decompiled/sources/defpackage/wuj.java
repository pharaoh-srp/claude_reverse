package defpackage;

import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class wuj extends pqk {
    public long G;
    public String H;
    public AccountManager I;
    public Boolean J;
    public long K;

    @Override // defpackage.pqk
    public final boolean N0() {
        Calendar calendar = Calendar.getInstance();
        this.G = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.H = ij0.C(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long O0() {
        L0();
        return this.G;
    }

    public final String P0() {
        L0();
        return this.H;
    }
}
