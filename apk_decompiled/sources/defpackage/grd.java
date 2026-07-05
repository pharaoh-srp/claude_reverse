package defpackage;

import com.anthropic.claude.api.chat.tool.ArrayProperty;
import com.anthropic.claude.api.chat.tool.BooleanProperty;
import com.anthropic.claude.api.chat.tool.IntegerProperty;
import com.anthropic.claude.api.chat.tool.NumberProperty;
import com.anthropic.claude.api.chat.tool.ObjectProperty;
import com.anthropic.claude.api.chat.tool.PropertyDefinition;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.UnknownProperty;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes2.dex */
public final class grd {
    public static final /* synthetic */ grd a = new grd();

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(PropertyDefinition.class));
        w3cVar.e(kceVar.b(BooleanProperty.class), BooleanProperty.Companion.serializer());
        w3cVar.e(kceVar.b(StringProperty.class), StringProperty.Companion.serializer());
        w3cVar.e(kceVar.b(NumberProperty.class), NumberProperty.Companion.serializer());
        w3cVar.e(kceVar.b(IntegerProperty.class), IntegerProperty.Companion.serializer());
        w3cVar.e(kceVar.b(ArrayProperty.class), ArrayProperty.Companion.serializer());
        w3cVar.e(kceVar.b(ObjectProperty.class), ObjectProperty.Companion.serializer());
        w3cVar.b(new f7d(17));
        w3cVar.a(aVar);
        aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.chat.tool.PropertyDefinition", kceVar.b(PropertyDefinition.class), new pl9[]{kceVar.b(ArrayProperty.class), kceVar.b(BooleanProperty.class), kceVar.b(IntegerProperty.class), kceVar.b(NumberProperty.class), kceVar.b(ObjectProperty.class), kceVar.b(StringProperty.class), kceVar.b(UnknownProperty.class)}, new KSerializer[]{fp0.a, xt1.a, l79.a, y9c.a, yac.a, krg.a, vei.a}, new Annotation[]{new xmb(7)});
    }
}
