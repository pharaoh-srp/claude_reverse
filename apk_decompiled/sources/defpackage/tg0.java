package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tg0 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static hea b(Configuration configuration) {
        String languageTags = configuration.getLocales().toLanguageTags();
        if (languageTags != null) {
            hea heaVar = hea.b;
            if (!languageTags.isEmpty()) {
                String[] strArrSplit = languageTags.split(",", -1);
                int length = strArrSplit.length;
                Locale[] localeArr = new Locale[length];
                for (int i = 0; i < length; i++) {
                    localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
                }
                return new hea(new iea(new LocaleList(localeArr)));
            }
        }
        return hea.b;
    }

    public static void c(hea heaVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(heaVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, hea heaVar) {
        configuration.setLocales(LocaleList.forLanguageTags(heaVar.a.a.toLanguageTags()));
    }
}
