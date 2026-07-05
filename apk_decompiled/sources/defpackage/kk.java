package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kk {
    public static final Set l = mp0.Z0(new String[]{"txt", "log", "md", "yaml", "yml", "xml", "csv", "ini", "cfg", "toml"});
    public final mp4 a;
    public final Context b;
    public final ze0 c;
    public final koi d;
    public final i25 e;
    public final hdc f;
    public final h86 g;
    public final wl h;
    public final vl i;
    public final lsc j = mpk.P(null);
    public fkg k;

    public kk(mp4 mp4Var, Context context, ze0 ze0Var, koi koiVar, i25 i25Var, hdc hdcVar, h86 h86Var, wl wlVar, vl vlVar) {
        this.a = mp4Var;
        this.b = context;
        this.c = ze0Var;
        this.d = koiVar;
        this.e = i25Var;
        this.f = hdcVar;
        this.g = h86Var;
        this.h = wlVar;
        this.i = vlVar;
    }

    public final void a(fk fkVar) {
        vl vlVar = this.i;
        wl wlVar = this.h;
        Context context = this.b;
        fkVar.getClass();
        String strC = fkVar.c();
        if (strC == null) {
            return;
        }
        String strO = kgh.o(this.c.a(), c(strC));
        String strB = fkVar.b();
        us8 us8Var = new us8();
        us8Var.h(null, strO);
        String strS0 = w44.S0(this.e.b(us8Var.c()), "; ", null, null, new q6(6), 30);
        DownloadManager.Request destinationInExternalPublicDir = new DownloadManager.Request(Uri.parse(strO)).setTitle(strB).addRequestHeader("Cookie", strS0).setAllowedOverMetered(true).setAllowedOverRoaming(true).setNotificationVisibility(1).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strB);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(ikb.a(strB));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "application/octet-stream";
        }
        DownloadManager.Request mimeType = destinationInExternalPublicDir.setMimeType(mimeTypeFromExtension);
        try {
            Object systemService = context.getSystemService("download");
            systemService.getClass();
            long jEnqueue = ((DownloadManager) systemService).enqueue(mimeType);
            sfa sfaVar = sfa.DEBUG;
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String str = "Download: enqueued id=" + jEnqueue + " filename='" + strB + "' url=" + strO + " cookieLen=" + strS0.length();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfaVar, "AgentChat", str);
                    }
                }
            }
            wlVar.invoke(xk.L);
            vlVar.a();
            try {
                Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                intent.setFlags(268435456);
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        } catch (Exception e) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList2.add(obj2);
                }
                if (!arrayList2.isEmpty()) {
                    zfa.a.getClass();
                    String strC2 = gsk.c(e);
                    StringBuilder sbR = kgh.r("Download enqueue failed for ", strB, " url=", strO, ": ");
                    sbR.append(strC2);
                    String string = sbR.toString();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((n30) ((zfa) it2.next())).b(sfa.ERROR, "AgentChat", string);
                    }
                }
            }
            wlVar.invoke(xk.I);
            vlVar.a();
        }
    }

    public final String b(String str) {
        return this.c.a() + "/api/" + this.d.e + "/files/" + str + "/preview";
    }

    public final String c(String str) {
        return ij0.l("/api/organizations/", this.d.e, "/files/", str, "/contents");
    }
}
