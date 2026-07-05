package com.datadog.android.core;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.dch;
import defpackage.g99;
import defpackage.gbf;
import defpackage.k99;
import defpackage.kj5;
import defpackage.kze;
import defpackage.mdj;
import defpackage.q4c;
import defpackage.tnh;
import defpackage.w44;
import defpackage.xaa;
import defpackage.xki;
import defpackage.yaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/datadog/android/core/UploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "xki", "dd-sdk-android-core_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public final class UploadWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final xaa d() {
        k99 k99VarA = kj5.a(this.b.b.c("_dd.sdk.instanceName"));
        k99 k99Var = k99VarA instanceof k99 ? k99VarA : null;
        if (k99Var == null || (k99Var instanceof q4c)) {
            dch.H(kze.a, 5, g99.E, tnh.K, null, false, 56);
            return yaa.a();
        }
        List<gbf> listF = k99Var.f();
        ArrayList arrayList = new ArrayList();
        for (gbf gbfVar : listF) {
            if (gbfVar == null) {
                gbfVar = null;
            }
            if (gbfVar != null) {
                arrayList.add(gbfVar);
            }
        }
        List listR1 = w44.r1(arrayList);
        Collections.shuffle(listR1);
        LinkedList linkedList = new LinkedList();
        Iterator it = listR1.iterator();
        while (it.hasNext()) {
            linkedList.offer(new xki(linkedList, k99Var, (gbf) it.next()));
        }
        while (!linkedList.isEmpty()) {
            xki xkiVar = (xki) linkedList.poll();
            if (xkiVar != null) {
                xkiVar.run();
            }
        }
        return yaa.a();
    }
}
