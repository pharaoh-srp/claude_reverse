package io.sentry.internal.modules;

import io.sentry.a1;
import io.sentry.t5;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {
    public final Pattern e;
    public final Pattern f;
    public final ClassLoader g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a1 a1Var) {
        super(a1Var);
        ClassLoader classLoader = c.class.getClassLoader();
        this.e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.g = io.sentry.config.a.e(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        HashMap map = new HashMap();
        ArrayList<b> arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.e.matcher(resources.nextElement().toString());
                b bVar = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.f.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        bVar = new b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        } catch (Throwable th) {
            this.a.d(t5.ERROR, "Unable to detect modules via manifest files.", th);
        }
        for (b bVar2 : arrayList) {
            map.put(bVar2.a, bVar2.b);
        }
        return map;
    }
}
