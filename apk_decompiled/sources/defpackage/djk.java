package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.api.chat.tool.CodeBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.JsonBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.RichItem;
import com.anthropic.claude.api.chat.tool.RichItemsDisplayContent;
import com.anthropic.claude.api.chat.tool.RichLinkDisplayContent;
import com.anthropic.claude.api.chat.tool.TableDisplayContent;
import com.anthropic.claude.api.chat.tool.TextDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolResultContent;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import com.anthropic.claude.api.chat.tool.UnknownDisplayContent;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import okio.Buffer;
import okio.ByteString;
import okio.RealBufferedSource;
import okio.SegmentedByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class djk {
    public static final ta4 a = new ta4(-253005290, false, new hb4(7));
    public static final ta4 b = new ta4(-840397033, false, new hb4(8));
    public static final ta4 c = new ta4(863016083, false, new jb4(19));

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1066596384);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            jl3 jl3VarA = gm3.a(e18Var);
            vve vveVarB = xve.b(12.0f);
            iqb iqbVarN = gb9.N(b.c(iqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            q64 q64VarA = p64.a(ko0.c, lja.U, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 0.8f);
            xo1 xo1Var = lja.I;
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            iqb iqbVarJ = gb9.J(androidx.compose.foundation.b.c(yfd.p(xn5.V(fqbVar, vveVarB), jl3VarA.q, vveVarB), false, null, null, null, zy7Var, 15), 12.0f);
            o5b o5bVarD2 = dw1.d(lja.G, false);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarJ);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            tjh.b(str, gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 22.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), jl3VarA.O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b(((jm3) gm3.c(e18Var).e.E).g, 0L, 0L, null, new wu7(1), null, 0L, null, 0, 0L, null, 0, 16777207), e18Var, (i2 & 14) | 48, 0, 131064);
            e18Var = e18Var;
            cv8.b(a.a(ud0.M1, e18Var), d4c.j0(R.string.ccr_queued_message_dismiss, e18Var), b.o(nw1.a.a(fqbVar, xo1Var), 14.0f), jl3VarA.O, e18Var, 8, 0);
            ij0.w(e18Var, true, true, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uf2(str, zy7Var, iqbVar, i, 5);
        }
    }

    public static final String b(String str) {
        return isg.n0(str, "•", "\n\n", false);
    }

    public static final btc c(List list) {
        List<KnowledgeSource> listW;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    String str = (String) ((Map.Entry) it2.next()).getKey();
                    KnowledgeSource knowledgeSource = (KnowledgeSource) linkedHashMap2.remove(str);
                    if (knowledgeSource != null) {
                        linkedHashMap.put(str, knowledgeSource);
                    }
                }
                if (linkedHashMap.isEmpty() && linkedHashMap2.isEmpty()) {
                    return null;
                }
                Collection collectionValues = linkedHashMap.values();
                collectionValues.getClass();
                List listP1 = w44.p1(collectionValues);
                Collection collectionValues2 = linkedHashMap2.values();
                collectionValues2.getClass();
                return new btc(listP1, w44.p1(collectionValues2));
            }
            mtc mtcVar = (mtc) it.next();
            if (mtcVar instanceof itc) {
                Iterator it3 = ((itc) mtcVar).c.iterator();
                while (it3.hasNext()) {
                    for (KnowledgeSource knowledgeSource2 : jpi.j((Citation) it3.next())) {
                        linkedHashMap.putIfAbsent(knowledgeSource2.getKey(), knowledgeSource2);
                    }
                }
            } else if (mtcVar instanceof htc) {
                for (ToolResultContent toolResultContent : ((htc) mtcVar).d) {
                    if (toolResultContent instanceof ToolResultKnowledge) {
                        KnowledgeSource.Companion.getClass();
                        KnowledgeSource knowledgeSourceD = wq9.d((ToolResultKnowledge) toolResultContent);
                        linkedHashMap2.putIfAbsent(knowledgeSourceD.getKey(), knowledgeSourceD);
                    }
                }
            } else if (mtcVar instanceof ParsedContentBlock$McpToolInvocation) {
                ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation = (ParsedContentBlock$McpToolInvocation) mtcVar;
                ToolDisplayContent outputDisplayContent = parsedContentBlock$McpToolInvocation.getOutputDisplayContent();
                if (outputDisplayContent != null) {
                    String integrationName = parsedContentBlock$McpToolInvocation.getIntegrationName();
                    if (outputDisplayContent instanceof RichItemsDisplayContent) {
                        List<RichItem> content = ((RichItemsDisplayContent) outputDisplayContent).getContent();
                        content.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (RichItem richItem : content) {
                            if (richItem.getSource() != null) {
                                KnowledgeSource.Companion.getClass();
                                KnowledgeSource knowledgeSourceC = wq9.c(richItem, true);
                                linkedHashMap3.putIfAbsent(knowledgeSourceC.getKey(), knowledgeSourceC);
                            }
                        }
                        Collection collectionValues3 = linkedHashMap3.values();
                        collectionValues3.getClass();
                        listW = w44.p1(collectionValues3);
                    } else if (outputDisplayContent instanceof RichLinkDisplayContent) {
                        RichLinkDisplayContent richLinkDisplayContent = (RichLinkDisplayContent) outputDisplayContent;
                        RichItem link = richLinkDisplayContent.getLink();
                        wq9 wq9Var = KnowledgeSource.Companion;
                        RichItem richItemCopy$default = link.getSource() != null ? link : null;
                        if (richItemCopy$default == null) {
                            richItemCopy$default = RichItem.copy$default(link, null, null, null, null, null, integrationName, 31, null);
                        }
                        boolean zR = x44.r(richLinkDisplayContent.is_trusted(), Boolean.TRUE);
                        wq9Var.getClass();
                        listW = x44.W(wq9.c(richItemCopy$default, zR));
                    } else {
                        if (!(outputDisplayContent instanceof CodeBlockDisplayContent) && !(outputDisplayContent instanceof JsonBlockDisplayContent) && !(outputDisplayContent instanceof TableDisplayContent) && !(outputDisplayContent instanceof TextDisplayContent) && !(outputDisplayContent instanceof UnknownDisplayContent)) {
                            wg6.i();
                            return null;
                        }
                        listW = lm6.E;
                    }
                    for (KnowledgeSource knowledgeSource3 : listW) {
                        linkedHashMap2.putIfAbsent(knowledgeSource3.getKey(), knowledgeSource3);
                    }
                } else {
                    continue;
                }
            } else if (!(mtcVar instanceof ysc) && !(mtcVar instanceof zsc) && !(mtcVar instanceof atc) && !(mtcVar instanceof btc) && !(mtcVar instanceof gtc) && !(mtcVar instanceof ParsedContentBlock$Thinking) && !(mtcVar instanceof ftc) && !(mtcVar instanceof ctc) && !(mtcVar instanceof ltc)) {
                wg6.i();
                return null;
            }
        }
    }

    public static final ltc d(String str, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ide ideVar = new ide("computer://[^\\s)\\]]+");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mtc mtcVar = (mtc) it.next();
            if (mtcVar instanceof itc) {
                jzc jzcVar = new jzc(ide.c(ideVar, ((itc) mtcVar).a));
                while (jzcVar.hasNext()) {
                    String strC = ((ova) jzcVar.next()).c();
                    Uri uri = Uri.parse(strC);
                    String encodedPath = x44.r(uri.getScheme(), "computer") ? uri.getEncodedPath() : null;
                    if (encodedPath == null) {
                        encodedPath = "";
                    }
                    Uri uri2 = Uri.parse(strC);
                    String path = x44.r(uri2.getScheme(), "computer") ? uri2.getPath() : null;
                    if (path == null) {
                        path = bsg.R0(strC, "computer://");
                    }
                    String str2 = (String) w44.V0(bsg.Y0(path, new String[]{"/"}, 6));
                    if (str2 != null) {
                        path = str2;
                    }
                    linkedHashMap.put(encodedPath, new iaj(path, encodedPath, str));
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return new ltc(w44.p1(linkedHashMap.values()));
    }

    public static p0h e(ld4 ld4Var) {
        n54 n54Var = ((gwa) ((e18) ld4Var).j(jwa.a)).a;
        p0h p0hVar = n54Var.m0;
        long j = n54Var.p;
        if (p0hVar != null) {
            return p0hVar;
        }
        long jC = p54.c(n54Var, me7.t);
        long jC2 = p54.c(n54Var, me7.w);
        long j2 = d54.g;
        long jC3 = p54.c(n54Var, me7.v);
        long jC4 = p54.c(n54Var, me7.D);
        long jC5 = p54.c(n54Var, me7.G);
        long jC6 = p54.c(n54Var, me7.C);
        long jC7 = p54.c(n54Var, me7.F);
        long jI = d4c.I(d54.b(me7.g, p54.c(n54Var, me7.f)), j);
        long jC8 = p54.c(n54Var, me7.j);
        float f = me7.k;
        p0h p0hVar2 = new p0h(jC, jC2, j2, jC3, jC4, jC5, jC6, jC7, jI, d4c.I(d54.b(f, jC8), j), j2, d4c.I(d54.b(me7.i, p54.c(n54Var, me7.h)), j), d4c.I(d54.b(me7.m, p54.c(n54Var, me7.l)), j), d4c.I(d54.b(f, p54.c(n54Var, me7.p)), j), d4c.I(d54.b(f, p54.c(n54Var, me7.q)), j), d4c.I(d54.b(me7.o, p54.c(n54Var, me7.n)), j));
        n54Var.m0 = p0hVar2;
        return p0hVar2;
    }

    public static final long f(RealBufferedSource realBufferedSource, ByteString byteString, int i, long j) {
        ByteString byteString2;
        Buffer buffer = realBufferedSource.F;
        byteString.getClass();
        long j2 = i;
        SegmentedByteString.b(byteString.e(), 0L, j2);
        long jMax = 0;
        if (realBufferedSource.G) {
            sz6.j("closed");
            return 0L;
        }
        int i2 = i;
        ByteString byteString3 = byteString;
        loop0: while (true) {
            long j3 = jMax;
            long jA = d.a(buffer, byteString3, j3, j, i2);
            if (jA == -1) {
                long j4 = buffer.F;
                long j5 = (j4 - j2) + 1;
                if (j5 >= j) {
                    break;
                }
                if (j4 >= j) {
                    int iMax = (int) Math.max(1L, (j4 - j) + 1);
                    int iMin = ((int) Math.min(j2, (buffer.F - j3) + 1)) - 1;
                    if (iMax > iMin) {
                        break;
                    }
                    while (true) {
                        byteString2 = byteString;
                        if (!buffer.x(iMin, buffer.F - ((long) iMin), byteString2)) {
                            if (iMin == iMax) {
                                break loop0;
                            }
                            iMin--;
                        } else {
                            break;
                        }
                    }
                } else {
                    byteString2 = byteString;
                }
                if (realBufferedSource.E.A0(buffer, 8192L) == -1) {
                    break;
                }
                jMax = Math.max(j3, j5);
                i2 = i;
                byteString3 = byteString2;
            } else {
                return jA;
            }
        }
        return -1L;
    }

    public static long g(RealBufferedSource realBufferedSource, ByteString byteString, long j) {
        return f(realBufferedSource, byteString, byteString.e(), j);
    }

    public static lla h(qh9 qh9Var) {
        tla tlaVar;
        String strM;
        String strM2;
        try {
            bh9 bh9VarS = qh9Var.s("plan");
            int i = 0;
            if (bh9VarS != null && (strM2 = bh9VarS.m()) != null) {
                tla[] tlaVarArrValues = tla.values();
                int length = tlaVarArrValues.length;
                for (int i2 = 0; i2 < length; i2++) {
                    tlaVar = tlaVarArrValues[i2];
                    if (!x44.r(tlaVar.E.toString(), strM2)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            tlaVar = null;
            bh9 bh9VarS2 = qh9Var.s("session_precondition");
            if (bh9VarS2 != null && (strM = bh9VarS2.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length2 = iArrH.length;
                while (i < length2) {
                    int i3 = iArrH[i];
                    if (y6a.k(i3).equals(strM)) {
                        i = i3;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new lla(tlaVar, i);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type DdSession", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type DdSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type DdSession", e3);
            return null;
        }
    }

    public static final boolean i(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!x44.r(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final void j(Throwable th) throws Throwable {
        throw th;
    }

    public abstract qh9 k();
}
