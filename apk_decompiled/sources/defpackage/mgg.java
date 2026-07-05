package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mgg {
    public static final vde a = nz8.u(12);

    public static nz8 a(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new a41(0)).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileE = q00.e(it.next());
            if (audioProfileE.getEncapsulationType() != 1 && tpi.y(audioProfileE.getFormat())) {
                for (int i : audioProfileE.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return nz8.q(treeSet);
    }
}
