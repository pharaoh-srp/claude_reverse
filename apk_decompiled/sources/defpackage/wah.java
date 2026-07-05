package defpackage;

import com.segment.analytics.kotlin.core.HTTPException;
import com.segment.analytics.kotlin.core.RemoteMetric;
import com.segment.analytics.kotlin.core.RemoteMetric$$serializer;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class wah implements lvg {
    public static double F = 1.0d;
    public static int M;
    public static boolean N;
    public static long O;
    public static final k57 R;
    public static final u0h S;
    public static final wah E = new wah();
    public static final q28 G = new q28("", new xjb(27));
    public static final boolean H = true;
    public static final vah I = vah.E;
    public static final int J = 20;
    public static final int K = 28000;
    public static final ConcurrentLinkedQueue L = new ConcurrentLinkedQueue();
    public static boolean P = true;
    public static final mp4 Q = fd9.c(nai.Z(iuj.g(), new al3(zp3.G, 4)));

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        R = new k57(executorServiceNewSingleThreadExecutor);
        S = new u0h(re4.f0);
    }

    public static void a(wah wahVar, String str, Map map, int i) {
        Object next;
        LinkedHashMap linkedHashMapL0 = sta.l0(map, (Map) S.getValue());
        ConcurrentLinkedQueue concurrentLinkedQueue = L;
        Iterator it = concurrentLinkedQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            RemoteMetric remoteMetric = (RemoteMetric) next;
            if (x44.r(remoteMetric.getMetric(), str) && x44.r(remoteMetric.getTags(), linkedHashMapL0)) {
                break;
            }
        }
        RemoteMetric remoteMetric2 = (RemoteMetric) next;
        if (remoteMetric2 != null) {
            remoteMetric2.setValue(remoteMetric2.getValue() + 1);
            return;
        }
        if (concurrentLinkedQueue.size() >= J) {
            return;
        }
        RemoteMetric remoteMetric3 = new RemoteMetric("Counter", str, 1, linkedHashMapL0, null);
        byte[] bytes = remoteMetric3.toString().getBytes(dj2.a);
        bytes.getClass();
        int length = bytes.length;
        if (M + length <= K) {
            concurrentLinkedQueue.add(remoteMetric3);
            M += length;
        }
    }

    public static void d() {
        String str;
        vah vahVar = I;
        if (F == 0.0d) {
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = L;
        int size = concurrentLinkedQueue.size();
        M = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = size - 1;
            if (size <= 0 || concurrentLinkedQueue.isEmpty()) {
                try {
                    ag9 ag9Var = bg9.d;
                    Map mapSingletonMap = Collections.singletonMap("series", arrayList);
                    mapSingletonMap.getClass();
                    ag9Var.getClass();
                    String strD = ag9Var.d(mapSingletonMap, new f7a(srg.a, new uo0(RemoteMetric$$serializer.INSTANCE, 0)));
                    se8 se8VarI = G.I("api.segment.io/v1");
                    OutputStream outputStream = se8VarI.G;
                    if (outputStream != null) {
                        try {
                            byte[] bytes = strD.getBytes(dj2.a);
                            bytes.getClass();
                            outputStream.write(bytes);
                            outputStream.flush();
                            outputStream.close();
                        } finally {
                        }
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    se8VarI.close();
                    return;
                } catch (HTTPException e) {
                    if (vahVar != null) {
                        vahVar.invoke(e);
                    }
                    if (e.E == 429) {
                        List list = (List) e.F.get("Retry-After");
                        Long lT0 = (list == null || (str = (String) w44.N0(list)) == null) ? null : isg.t0(str);
                        if (lT0 != null) {
                            O = (System.currentTimeMillis() / 1000) + lT0.longValue();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    if (vahVar != null) {
                        vahVar.invoke(e2);
                        return;
                    }
                    return;
                }
            }
            RemoteMetric remoteMetric = (RemoteMetric) concurrentLinkedQueue.poll();
            if (remoteMetric != null) {
                remoteMetric.setValue(mwa.K(((double) remoteMetric.getValue()) / F));
                arrayList.add(remoteMetric);
            }
            size = i;
        }
    }

    public final synchronized void b() {
        try {
            if (L.isEmpty()) {
                return;
            }
            if (O > ((int) (System.currentTimeMillis() / 1000))) {
                return;
            }
            O = 0L;
            try {
                d();
                M = 0;
            } catch (Throwable th) {
                vah vahVar = I;
                if (vahVar != null) {
                    vahVar.invoke(th);
                }
                F = 0.0d;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(String str, bz7 bz7Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bz7Var.invoke(linkedHashMap);
        if (F != 0.0d && isg.q0(str, "analytics_mobile", false) && !linkedHashMap.isEmpty() && Math.random() <= F) {
            a(this, str, linkedHashMap, 12);
        }
    }
}
