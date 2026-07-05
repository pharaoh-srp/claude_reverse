package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d31 {
    public static final /* synthetic */ d31 a = new d31();
    public static final Set b;
    public static final Set c;
    public static final List d;

    static {
        Set setZ0 = mp0.Z0(new String[]{"application/json", "application/xml", "application/yaml", "application/x-yaml", "application/javascript", "application/x-sh", "image/svg+xml"});
        b = setZ0;
        Set setZ02 = mp0.Z0(new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/msword", "application/vnd.oasis.opendocument.text", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/rtf", "application/x-ipynb+json", "application/epub+zip", "application/octet-stream"});
        c = setZ02;
        d = w44.p1(dxf.p0(dxf.p0(mp0.Z0(new String[]{"text/*", "image/*", "application/pdf"}), setZ0), setZ02));
    }

    public static Set a() {
        return b;
    }

    public static boolean b(String str) {
        String strL = xb5.l(str);
        if (strL == null) {
            return false;
        }
        List list = d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (fsk.e(strL.split("/"), ((String) it.next()).split("/"))) {
                return true;
            }
        }
        return false;
    }
}
