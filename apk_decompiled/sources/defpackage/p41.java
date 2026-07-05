package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p41 {
    public static final long c;
    public final h86 a;
    public final AudioManager b;

    static {
        lz1 lz1Var = uh6.F;
        c = v40.Q(20, zh6.SECONDS);
    }

    public p41(h86 h86Var) {
        this.a = h86Var;
        Context context = x44.d;
        if (context == null) {
            sz6.j("Context not initialized");
            throw null;
        }
        Object systemService = context.getSystemService("audio");
        this.b = systemService instanceof AudioManager ? (AudioManager) systemService : null;
    }

    public static final List a(p41 p41Var) {
        AudioManager audioManager;
        List availableCommunicationDevices;
        if (Build.VERSION.SDK_INT < 31 || (audioManager = p41Var.b) == null || (availableCommunicationDevices = audioManager.getAvailableCommunicationDevices()) == null) {
            return lm6.E;
        }
        d8a d8aVarE = x44.E();
        List list = availableCommunicationDevices;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((AudioDeviceInfo) it.next()).getType() == 2) {
                    d8aVarE.add(r51.a);
                    break;
                }
            }
        }
        ArrayList<AudioDeviceInfo> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AudioDeviceInfo) obj).getType() == 7) {
                arrayList.add(obj);
            }
        }
        for (AudioDeviceInfo audioDeviceInfo : arrayList) {
            int id = audioDeviceInfo.getId();
            CharSequence productName = audioDeviceInfo.getProductName();
            String string = productName != null ? productName.toString() : null;
            if (string == null) {
                string = "";
            }
            d8aVarE.add(new q51(id, string));
        }
        return x44.v(d8aVarE);
    }

    public static final s51 b(p41 p41Var, AudioDeviceInfo audioDeviceInfo) {
        int type = audioDeviceInfo.getType();
        if (type == 2) {
            return r51.a;
        }
        if (type != 7) {
            return null;
        }
        int id = audioDeviceInfo.getId();
        CharSequence productName = audioDeviceInfo.getProductName();
        String string = productName != null ? productName.toString() : null;
        if (string == null) {
            string = "";
        }
        return new q51(id, string);
    }

    public static final boolean d(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((AudioPlaybackConfiguration) it.next()).getAudioAttributes().getUsage() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.b41
            if (r0 == 0) goto L13
            r0 = r9
            b41 r0 = (defpackage.b41) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            b41 r0 = new b41
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            iei r4 = defpackage.iei.a
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            defpackage.sf5.h0(r9)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            return r4
        L28:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r3
        L2e:
            defpackage.sf5.h0(r9)
            android.media.AudioManager r8 = r8.b
            if (r8 != 0) goto L36
            goto L60
        L36:
            java.util.List r9 = r8.getActivePlaybackConfigurations()     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            r9.getClass()     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            boolean r1 = d(r9)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            if (r1 != 0) goto L44
            goto L60
        L44:
            lz1 r1 = defpackage.uh6.F     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            zh6 r1 = defpackage.zh6.MILLISECONDS     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            r5 = 150(0x96, float:2.1E-43)
            long r5 = defpackage.v40.Q(r5, r1)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            m0 r1 = new m0     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            r7 = 23
            r1.<init>(r8, r9, r3, r7)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            r0.G = r2     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            java.lang.Object r8 = defpackage.iuj.R(r5, r1, r0)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L61
            m45 r9 = defpackage.m45.E
            if (r8 != r9) goto L60
            return r9
        L60:
            return r4
        L61:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p41.c(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.vp4 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.d41
            if (r0 == 0) goto L13
            r0 = r8
            d41 r0 = (defpackage.d41) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            d41 r0 = new d41
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            iei r4 = defpackage.iei.a
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.sf5.h0(r8)     // Catch: java.lang.Exception -> L56 java.util.concurrent.CancellationException -> L57
            return r4
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L2e:
            defpackage.sf5.h0(r8)
            android.media.AudioManager r7 = r7.b
            if (r7 != 0) goto L36
            goto L56
        L36:
            boolean r7 = r7.isBluetoothScoOn()     // Catch: java.lang.Exception -> L56 java.util.concurrent.CancellationException -> L57
            if (r7 != 0) goto L3d
            goto L56
        L3d:
            lz1 r8 = defpackage.uh6.F     // Catch: java.lang.Exception -> L56 java.util.concurrent.CancellationException -> L57
            zh6 r8 = defpackage.zh6.SECONDS     // Catch: java.lang.Exception -> L56 java.util.concurrent.CancellationException -> L57
            r1 = 2
            long r5 = defpackage.v40.Q(r1, r8)     // Catch: java.lang.Exception -> L56 java.util.concurrent.CancellationException -> L57
            g41 r8 = new g41     // Catch: java.lang.Exception -> L56 java.util.concurrent.CancellationException -> L57
            r8.<init>(r7, r2)     // Catch: java.lang.Exception -> L56 java.util.concurrent.CancellationException -> L57
            r0.G = r3     // Catch: java.lang.Exception -> L56 java.util.concurrent.CancellationException -> L57
            java.lang.Object r7 = defpackage.iuj.R(r5, r8, r0)     // Catch: java.lang.Exception -> L56 java.util.concurrent.CancellationException -> L57
            m45 r8 = defpackage.m45.E
            if (r7 != r8) goto L56
            return r8
        L56:
            return r4
        L57:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p41.e(vp4):java.lang.Object");
    }

    public final void f() {
        AudioManager audioManager = this.b;
        if (audioManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            audioManager.clearCommunicationDevice();
        } else {
            audioManager.setSpeakerphoneOn(false);
        }
        audioManager.setMode(0);
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, "clearCommunicationDevice()");
            }
        }
    }

    public final boolean g() {
        Object next;
        AudioManager audioManager = this.b;
        if (audioManager == null) {
            return false;
        }
        if (audioManager.getMode() == 0) {
            audioManager.setMode(3);
        }
        if (Build.VERSION.SDK_INT < 31) {
            audioManager.setSpeakerphoneOn(true);
            return true;
        }
        List availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        availableCommunicationDevices.getClass();
        Iterator it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AudioDeviceInfo) next).getType() == 2) {
                break;
            }
        }
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) next;
        if (audioDeviceInfo != null) {
            return audioManager.setCommunicationDevice(audioDeviceInfo);
        }
        return false;
    }

    public final AudioDeviceInfo h() {
        AudioManager audioManager;
        List availableCommunicationDevices;
        Object obj = null;
        if (Build.VERSION.SDK_INT < 31 || (audioManager = this.b) == null || (availableCommunicationDevices = audioManager.getAvailableCommunicationDevices()) == null) {
            return null;
        }
        Iterator it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AudioDeviceInfo) next).getType() == 7) {
                obj = next;
                break;
            }
        }
        return (AudioDeviceInfo) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.s51 r7, defpackage.uh6 r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p41.i(s51, uh6, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.media.AudioDeviceInfo r12, defpackage.uh6 r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p41.j(android.media.AudioDeviceInfo, uh6, vp4):java.lang.Object");
    }
}
