package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mw4 {
    public static final ide a = new ide("\\b(src|href|poster|srcset)=([\"'])/sessions/");
    public static final ide b = new ide("(,\\s*)/sessions/");
    public static final ide c;
    public static final ide d;
    public static final ide e;
    public static final ide f;

    static {
        jde jdeVar = jde.IGNORE_CASE;
        c = new ide("\\burl\\(\\s*([\"']?)/sessions/", jdeVar);
        d = new ide("\\b(src|href|poster|srcset)=([\"'])/sandbox/proxy/my/");
        e = new ide("(,\\s*)/sandbox/proxy/my/");
        f = new ide("\\burl\\(\\s*([\"']?)/sandbox/proxy/my/", jdeVar);
    }

    public static final ArrayList a(List list, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            wpg wpgVar = (wpg) obj;
            if ((wpgVar instanceof rpg) || (wpgVar instanceof spg)) {
                z2 = z;
            } else {
                if (!(wpgVar instanceof upg) && !(wpgVar instanceof tpg) && !(wpgVar instanceof vpg) && !(wpgVar instanceof opg) && !(wpgVar instanceof qpg) && !(wpgVar instanceof ppg) && !(wpgVar instanceof mpg) && !(wpgVar instanceof npg)) {
                    wg6.i();
                    return null;
                }
                z2 = true;
            }
            if (z2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
