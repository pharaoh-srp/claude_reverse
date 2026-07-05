package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class qfj {
    public static cwi a(qh9 qh9Var) {
        ArrayList arrayList;
        try {
            long jK = qh9Var.s("format_version").k();
            bh9 bh9VarS = qh9Var.s("session");
            ewi ewiVarA = bh9VarS != null ? hgj.a(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("configuration");
            vvi vviVarA = bh9VarS2 != null ? fdj.a(bh9VarS2.g()) : null;
            bh9 bh9VarS3 = qh9Var.s("browser_sdk_version");
            String strM = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("sdk_name");
            String strM2 = bh9VarS4 != null ? bh9VarS4.m() : null;
            long jK2 = qh9Var.s("document_version").k();
            bh9 bh9VarS5 = qh9Var.s("page_states");
            if (bh9VarS5 != null) {
                ArrayList arrayList2 = bh9VarS5.e().E;
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(fhk.e(((bh9) it.next()).g()));
                }
            } else {
                arrayList = null;
            }
            bh9 bh9VarS6 = qh9Var.s("replay_stats");
            dxi dxiVarA = bh9VarS6 != null ? yvj.a(bh9VarS6.g()) : null;
            bh9 bh9VarS7 = qh9Var.s("cls");
            dwi dwiVarH = bh9VarS7 != null ? mwj.h(bh9VarS7.g()) : null;
            bh9 bh9VarS8 = qh9Var.s("profiling");
            cxi cxiVarF = bh9VarS8 != null ? bik.f(bh9VarS8.g()) : null;
            if (jK == 2) {
                return new cwi(ewiVarA, vviVarA, strM, strM2, jK2, arrayList, dxiVarA, dwiVarH, cxiVarF);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Dd", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Dd", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Dd", e3);
            return null;
        }
    }

    public static final void b(Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            nga ngaVarC = nga.c();
            String str = rfj.a;
            ngaVarC.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = rfj.b;
            int iD0 = tta.d0(strArr.length);
            if (iD0 < 16) {
                iD0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(noBackupFilesDir.getPath() + str2));
            }
            for (Map.Entry entry : sta.m0(linkedHashMap, new cpc(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        nga.c().f(rfj.a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        file.toString();
                        file2.toString();
                    } else {
                        file.toString();
                        file2.toString();
                    }
                    nga ngaVarC2 = nga.c();
                    String str3 = rfj.a;
                    ngaVarC2.getClass();
                }
            }
        }
    }
}
