package defpackage;

import com.anthropic.claude.api.experience.ExperienceTrackActionData;
import com.anthropic.claude.api.experience.TrackActionedData;
import com.anthropic.claude.api.experience.TrackDismissedData;
import com.anthropic.claude.api.experience.TrackShownData;
import com.anthropic.claude.api.experience.TrackUnknownActionData;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class ya7 {
    public static final /* synthetic */ ya7 a = new ya7();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(ExperienceTrackActionData.class));
        w3cVar.e(kceVar.b(TrackActionedData.class), TrackActionedData.Companion.serializer());
        w3cVar.e(kceVar.b(TrackDismissedData.class), TrackDismissedData.Companion.serializer());
        w3cVar.e(kceVar.b(TrackShownData.class), TrackShownData.Companion.serializer());
        w3cVar.b(new xg5(23));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        int i = 7;
        return new odf("com.anthropic.claude.api.experience.ExperienceTrackActionData", kceVar.b(ExperienceTrackActionData.class), new pl9[]{kceVar.b(TrackActionedData.class), kceVar.b(TrackDismissedData.class), kceVar.b(TrackShownData.class), kceVar.b(TrackUnknownActionData.class)}, new KSerializer[]{p3i.a, r3i.a, g4i.a, new lq6("com.anthropic.claude.api.experience.TrackUnknownActionData", TrackUnknownActionData.INSTANCE, new Annotation[]{new gl0(i)})}, new Annotation[]{new gl0(i)});
    }
}
