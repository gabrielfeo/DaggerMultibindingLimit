import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeavyMultibindingModule_ProvideObject200Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject200Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject200(module);
  }

  public static HeavyMultibindingModule_ProvideObject200Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject200Factory(module);
  }

  public static Object provideObject200(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject200());
  }
}
