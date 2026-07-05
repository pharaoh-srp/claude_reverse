package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class k9i extends f9i {
    public final /* synthetic */ int a;

    public /* synthetic */ k9i(int i) {
        this.a = i;
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        switch (this.a) {
            case 0:
                return new AtomicBoolean(jsonReader.nextBoolean());
            default:
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
        }
    }

    @Override // defpackage.f9i
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                jsonWriter.value(((AtomicBoolean) obj).get());
                break;
            default:
                jsonWriter.value(((AtomicInteger) obj).get());
                break;
        }
    }
}
