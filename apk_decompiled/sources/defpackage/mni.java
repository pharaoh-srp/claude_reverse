package defpackage;

import com.anthropic.claude.tool.model.UserLocationV0Output;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationError;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResult;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class mni {
    public static final /* synthetic */ mni a = new mni();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.UserLocationV0Output", kceVar.b(UserLocationV0Output.class), new pl9[]{kceVar.b(UserLocationV0OutputUserLocationError.class), kceVar.b(UserLocationV0OutputUserLocationResult.class)}, new KSerializer[]{nni.a, rni.a}, new Annotation[]{new gl0(1)});
    }
}
