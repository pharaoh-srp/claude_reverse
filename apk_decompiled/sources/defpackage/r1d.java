package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class r1d implements pjb {
    public final AssetManager a;

    public r1d(AssetManager assetManager) {
        this.a = assetManager;
    }

    @Override // defpackage.pjb
    public final InputStream a(String str) {
        try {
            return this.a.open(str.substring(1));
        } catch (IOException e) {
            zfa.a.getClass();
            if (!yfa.b()) {
                return null;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            zfa.a.getClass();
            String strK = ij0.k("Failed to load metadata file: ", str, ": ", gsk.c(e));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, "PhoneNumberMetadataLoader", strK);
            }
            return null;
        }
    }
}
