package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.McpEvents$McpServersListed;
import com.anthropic.claude.api.conway.HeartbeatRecord;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.ModelInfo;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.types.strings.EmailAddress;
import com.anthropic.claude.types.strings.ModelId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ty4 extends m08 implements bz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty4(nf9 nf9Var) {
        super(1, 0, nf9.class, nf9Var, "invoke", "invoke(Ljava/lang/Throwable;)V");
        this.E = 20;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = 29;
        int i2 = 2;
        int i3 = 0;
        tp4 tp4Var = null;
        switch (this.E) {
            case 0:
                String str = (String) obj;
                str.getClass();
                f fVar = (f) this.receiver;
                fVar.getClass();
                c61 c61Var = fVar.X;
                if (c61Var != null) {
                    gb9.D(fVar.a, null, null, new ly4(c61Var, str, tp4Var, i3), 3);
                }
                return iei.a;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                f fVar2 = (f) this.receiver;
                fVar2.getClass();
                c61 c61Var2 = fVar2.X;
                if (c61Var2 != null) {
                    gb9.D(fVar2.a, null, null, new ly4(c61Var2, str2, tp4Var, i3), 3);
                }
                return iei.a;
            case 2:
                ((f) this.receiver).I0(((Boolean) obj).booleanValue());
                return iei.a;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                p05 p05Var = (p05) this.receiver;
                p05Var.getClass();
                fz4 fz4VarQ = p05Var.Q();
                dz4 dz4Var = fz4VarQ instanceof dz4 ? (dz4) fz4VarQ : null;
                List list = dz4Var != null ? (List) dz4Var.a : null;
                int i4 = -1;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (x44.r(((HeartbeatRecord) it.next()).getName(), str3)) {
                                i4 = i3;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                int i5 = i4;
                HeartbeatRecord heartbeatRecord = (i5 < 0 || list == null) ? null : (HeartbeatRecord) list.get(i5);
                p05Var.X(wsk.e(p05Var.Q(), new w43(str3, 28)));
                gb9.D(p05Var.a, null, null, new x43(p05Var, str3, heartbeatRecord, i5, (tp4) null), 3);
                return iei.a;
            case 4:
                String str4 = (String) obj;
                str4.getClass();
                p05 p05Var2 = (p05) this.receiver;
                p05Var2.getClass();
                lsc lscVar = p05Var2.n;
                lscVar.setValue(wsk.e((fz4) lscVar.getValue(), new w43(str4, i)));
                gb9.D(p05Var2.a, null, null, new ed3(p05Var2, str4, tp4Var, 22), 3);
                return iei.a;
            case 5:
                String strM1064unboximpl = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl.getClass();
                f fVar3 = (f) this.receiver;
                fVar3.getClass();
                lsc lscVar2 = fVar3.U;
                b0 b0VarQ0 = fVar3.q0();
                if (b0VarQ0 != null) {
                    fVar3.V.setValue(null);
                    fz4 fz4Var = (fz4) lscVar2.getValue();
                    dz4 dz4Var2 = fz4Var instanceof dz4 ? (dz4) fz4Var : null;
                    if (dz4Var2 != null) {
                        lscVar2.setValue(new dz4(ModelInfo.m742copyr6p41GU$default((ModelInfo) dz4Var2.a, strM1064unboximpl, null, 2, null)));
                    }
                    fkg fkgVar = fVar3.W;
                    if (fkgVar != null) {
                        fkgVar.d(null);
                    }
                    fVar3.W = gb9.D(fVar3.a, null, null, new rx4(fVar3, b0VarQ0, strM1064unboximpl, null), 3);
                }
                return iei.a;
            case 6:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                h6j h6jVar = (h6j) this.receiver;
                h6jVar.getClass();
                if (!h6jVar.f) {
                    synchronized (h6jVar.e) {
                        h6jVar.e.add(Arrays.copyOf(bArr, bArr.length));
                    }
                }
                return iei.a;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                b55 b55Var = (b55) this.receiver;
                if (b55Var.h && iIntValue > 0) {
                    b55Var.h = false;
                    b55Var.e.e(new McpEvents$McpServersListed(b55Var.f, iIntValue), McpEvents$McpServersListed.Companion.serializer());
                }
                return iei.a;
            case 8:
                return (ao5) ((drd) this.receiver).a(obj);
            case 9:
                double dDoubleValue = ((Number) obj).doubleValue();
                ((y2a) this.receiver).getClass();
                return y2a.a(dDoubleValue);
            case 10:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                ((y2a) this.receiver).getClass();
                return y2a.a(dDoubleValue2);
            case 11:
                cjh cjhVar = (cjh) obj;
                cjhVar.getClass();
                ((rp6) this.receiver).W(cjhVar);
                return iei.a;
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                kdg kdgVar = ((wg7) this.receiver).k;
                if (iIntValue2 >= 0 && iIntValue2 < kdgVar.size()) {
                    kdgVar.remove(iIntValue2);
                }
                return iei.a;
            case 13:
                List list2 = (List) obj;
                list2.getClass();
                wg7 wg7Var = (wg7) this.receiver;
                wg7Var.getClass();
                kdg kdgVar2 = wg7Var.k;
                kdgVar2.addAll(w44.j1(list2, 3 - kdgVar2.size()));
                return iei.a;
            case 14:
                Collection collection = (Collection) obj;
                collection.getClass();
                ((Context) this.receiver).revokeSelfPermissionsOnKill(collection);
                return iei.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                double dDoubleValue3 = ((Number) obj).doubleValue();
                ((y2a) this.receiver).getClass();
                return y2a.a(dDoubleValue3);
            case 16:
                double dDoubleValue4 = ((Number) obj).doubleValue();
                ((y2a) this.receiver).getClass();
                return y2a.a(dDoubleValue4);
            case g.MAX_FIELD_NUMBER /* 17 */:
                double dDoubleValue5 = ((Number) obj).doubleValue();
                ((y2a) this.receiver).getClass();
                return y2a.a(dDoubleValue5);
            case g.AVG_FIELD_NUMBER /* 18 */:
                double dDoubleValue6 = ((Number) obj).doubleValue();
                ((o5j) this.receiver).getClass();
                return new t5j(dDoubleValue6, s5j.E);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                y5e y5eVar = (y5e) obj;
                y5eVar.getClass();
                ((j8i) this.receiver).h(y5eVar);
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((nf9) this.receiver).s((Throwable) obj);
                return iei.a;
            case 21:
                String str5 = (String) obj;
                str5.getClass();
                m9j m9jVar = (m9j) this.receiver;
                m9jVar.getClass();
                m9jVar.t.setValue(EmailAddress.m1006boximpl(EmailAddress.m1007constructorimpl(str5)));
                return iei.a;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                String str6 = (String) obj;
                str6.getClass();
                poa poaVar = (poa) this.receiver;
                poaVar.getClass();
                poaVar.m.setValue(str6);
                return iei.a;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String str7 = (String) obj;
                str7.getClass();
                ((mya) this.receiver).getClass();
                byte[] bArrDecode = Base64.decode(str7, 0);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                int i6 = options.outWidth;
                if (i6 <= 0 || options.outHeight <= 0) {
                    return null;
                }
                return new cpc(Integer.valueOf(i6), Integer.valueOf(options.outHeight));
            case 24:
                String str8 = (String) obj;
                str8.getClass();
                qya qyaVar = (qya) this.receiver;
                gb9.D(qyaVar.b0, null, null, new ix5(qyaVar, str8, tp4Var, i), 3);
                return iei.a;
            case BuildConfig.VERSION_CODE /* 25 */:
                String str9 = (String) obj;
                str9.getClass();
                sza szaVar = (sza) this.receiver;
                szaVar.getClass();
                sfa sfaVar = sfa.INFO;
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(szaVar);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList.add(obj2);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String strK = vb7.k(str9.length(), "sendMessage (", " chars): ", bsg.j1(200, str9));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar, strE, strK);
                        }
                    }
                }
                gd1 gd1Var = id1.e;
                byte[] bytes = str9.getBytes(dj2.a);
                bytes.getClass();
                szaVar.post(new yw5(szaVar, 11, ij0.j("window.mcpAppBridgeReceive((function(base64String) {\n    const binaryString = atob(base64String);\n    const bytes = new Uint8Array(binaryString.length);\n    for (let i = 0; i < binaryString.length; i++) {\n        bytes[i] = binaryString.charCodeAt(i);\n    }\n    const decoder = new TextDecoder('utf-8');\n    const decodedString = decoder.decode(bytes);\n    return decodedString;\n})('", id1.b(gd1Var, bytes), "'))")));
                return iei.a;
            case 26:
                UUID uuid = (UUID) obj;
                uuid.getClass();
                u3c u3cVar = (u3c) this.receiver;
                u3cVar.getClass();
                b54.w0(new xl(uuid, i2), u3cVar.m);
                lf9 lf9Var = (lf9) u3cVar.n.remove(uuid);
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
                return iei.a;
            case 27:
                double dDoubleValue7 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue7);
            case 28:
                double dDoubleValue8 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue8);
            default:
                double dDoubleValue9 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ty4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }
}
