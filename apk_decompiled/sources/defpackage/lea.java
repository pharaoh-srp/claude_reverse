package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lea {
    public final kea a;
    public final mdg b = new mdg();
    public final ConcurrentHashMap.KeySetView c = ConcurrentHashMap.newKeySet();

    public lea(kea keaVar) {
        this.a = keaVar;
    }

    public static void c(lea leaVar, Map map) {
        String strA = leaVar.a();
        if (map.isEmpty()) {
            return;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(leaVar);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strK = vb7.k(map.size(), "Setting ", " translations for locale: ", strA);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, strK);
                }
            }
        }
        leaVar.b.put(strA, map);
    }

    public final String a() {
        Locale locale = (Locale) w44.N0(this.a.a);
        if (locale == null) {
            locale = Locale.US;
        }
        String languageTag = locale.toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    public final String b(String str) {
        str.getClass();
        String strA = a();
        Map map = (Map) this.b.get(strA);
        if (map != null) {
            String str2 = (String) map.get(str);
            if (str2 == null && !bsg.I0(str)) {
                Locale locale = (Locale) w44.N0(this.a.a);
                if (!x44.r(locale != null ? locale.getLanguage() : null, Locale.ENGLISH.getLanguage())) {
                    String strValueOf = String.valueOf(str.hashCode());
                    if (this.c.add(strA + "|" + strValueOf)) {
                        List list = xah.a;
                        xah.d("Missing translation for server localized string", "i18n", sta.h0(new cpc("key_hash", strValueOf), new cpc("key_length", String.valueOf(str.length())), new cpc("locale", strA)));
                        SilentException.a(new SilentException("Missing translation for server localized string"), null, false, 3);
                    }
                }
            }
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
