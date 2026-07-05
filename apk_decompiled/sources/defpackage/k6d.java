package defpackage;

import com.anthropic.claude.bell.PlaybackPace;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class k6d {
    public static PlaybackPace a(String str) {
        Object next;
        Iterator<E> it = PlaybackPace.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x44.r(((PlaybackPace) next).name(), str)) {
                break;
            }
        }
        PlaybackPace playbackPace = (PlaybackPace) next;
        return playbackPace == null ? PlaybackPace.DEFAULT : playbackPace;
    }

    public static PlaybackPace b() {
        return PlaybackPace.DEFAULT;
    }

    public final KSerializer serializer() {
        return (KSerializer) PlaybackPace.$cachedSerializer$delegate.getValue();
    }
}
