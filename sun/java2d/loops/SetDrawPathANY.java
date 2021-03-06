package sun.java2d.loops;

import java.awt.geom.Path2D;
import sun.java2d.SunGraphics2D;
import sun.java2d.SurfaceData;

class SetDrawPathANY extends DrawPath {
  SetDrawPathANY() { super(SurfaceType.AnyColor, CompositeType.SrcNoEa, SurfaceType.Any); }
  
  public void DrawPath(SunGraphics2D paramSunGraphics2D, SurfaceData paramSurfaceData, int paramInt1, int paramInt2, Path2D.Float paramFloat) {
    PixelWriter pixelWriter = GeneralRenderer.createSolidPixelWriter(paramSunGraphics2D, paramSurfaceData);
    ProcessPath.drawPath(new PixelWriterDrawHandler(paramSurfaceData, pixelWriter, paramSunGraphics2D.getCompClip(), paramSunGraphics2D.strokeHint), paramFloat, paramInt1, paramInt2);
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\sun\java2d\loops\SetDrawPathANY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */