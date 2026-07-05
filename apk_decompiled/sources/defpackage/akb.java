package defpackage;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class akb {
    public static final long i;
    public final h86 a;
    public final p41 b;
    public AudioRecord c;
    public bkb d;
    public boolean e;
    public volatile boolean f;
    public final Object g = new Object();
    public volatile float h;

    static {
        lz1 lz1Var = uh6.F;
        i = v40.Q(2, zh6.SECONDS);
    }

    public akb(h86 h86Var, p41 p41Var) {
        this.a = h86Var;
        this.b = p41Var;
    }

    public static final cpc a(akb akbVar, AudioRecord audioRecord, bkb bkbVar) {
        AcousticEchoCanceler acousticEchoCancelerCreate;
        boolean zC = bkbVar.c();
        sfa sfaVar = sfa.ERROR;
        NoiseSuppressor noiseSuppressor = null;
        if (zC) {
            try {
                acousticEchoCancelerCreate = AcousticEchoCanceler.create(audioRecord.getAudioSessionId());
                acousticEchoCancelerCreate.setEnabled(true);
            } catch (Exception e) {
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(akbVar);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        String strQ = sq6.q(zfa.a, e, "Error creating AcousticEchoCanceler ");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, strE, strQ);
                        }
                    }
                }
                acousticEchoCancelerCreate = null;
            }
        } else {
            acousticEchoCancelerCreate = null;
        }
        try {
            NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(audioRecord.getAudioSessionId());
            noiseSuppressorCreate.setEnabled(true);
            noiseSuppressor = noiseSuppressorCreate;
        } catch (Exception e2) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE2 = iuj.E(akbVar);
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList2.add(obj2);
                }
                if (!arrayList2.isEmpty()) {
                    String strQ2 = sq6.q(zfa.a, e2, "Error creating NoiseSuppressor ");
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((n30) ((zfa) it2.next())).b(sfaVar, strE2, strQ2);
                    }
                }
            }
        }
        return new cpc(acousticEchoCancelerCreate, noiseSuppressor);
    }

    public static final AudioRecord b(akb akbVar, int i2, bkb bkbVar) {
        AudioRecord.Builder bufferSizeInBytes = new AudioRecord.Builder().setAudioSource(bkbVar.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(16000).setChannelMask(16).setEncoding(2).build()).setBufferSizeInBytes(i2);
        if (Build.VERSION.SDK_INT >= 30) {
            bufferSizeInBytes.setPrivacySensitive(false);
        }
        AudioRecord audioRecordBuild = bufferSizeInBytes.build();
        audioRecordBuild.getClass();
        return audioRecordBuild;
    }

    public static final uh6 d(akb akbVar) {
        if (akbVar.e) {
            return new uh6(p41.c);
        }
        return null;
    }

    public final float h() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.bkb r6, defpackage.uh6 r7, defpackage.vp4 r8) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akb.i(bkb, uh6, vp4):java.lang.Object");
    }
}
