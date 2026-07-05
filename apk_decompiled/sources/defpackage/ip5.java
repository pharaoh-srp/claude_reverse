package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ip5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Context G;
    public final /* synthetic */ mp5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip5(Context context, mp5 mp5Var, int i) {
        super(0);
        this.F = i;
        this.G = context;
        this.H = mp5Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        String languageTag;
        String languageTag2;
        int i = this.F;
        mp5 mp5Var = this.H;
        Context context = this.G;
        switch (i) {
            case 0:
                Resources resources = context.getResources();
                boolean z = ((hz1) mp5Var.E).c;
                String languageTag3 = null;
                if (z) {
                    Locale locale = resources.getConfiguration().getLocales().get(0);
                    if (locale != null) {
                        languageTag3 = locale.toLanguageTag();
                    }
                } else {
                    Locale locale2 = resources.getConfiguration().locale;
                    if (locale2 != null) {
                        languageTag3 = locale2.toLanguageTag();
                    }
                }
                return languageTag3 == null ? Locale.getDefault().toLanguageTag() : languageTag3;
            default:
                Resources resources2 = context.getResources();
                ArrayList arrayList = new ArrayList();
                if (((hz1) mp5Var.E).c) {
                    LocaleList locales = resources2.getConfiguration().getLocales();
                    locales.getClass();
                    int size = locales.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Locale locale3 = locales.get(i2);
                        if (locale3 != null && (languageTag2 = locale3.toLanguageTag()) != null) {
                            arrayList.add(languageTag2);
                        }
                    }
                } else {
                    Locale locale4 = resources2.getConfiguration().locale;
                    if (locale4 != null && (languageTag = locale4.toLanguageTag()) != null) {
                        arrayList.add(languageTag);
                    }
                }
                return arrayList;
        }
    }
}
