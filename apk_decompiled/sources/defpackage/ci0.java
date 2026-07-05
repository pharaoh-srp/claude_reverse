package defpackage;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ci0 {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
